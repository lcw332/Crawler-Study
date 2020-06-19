package com.lcw.app.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.google.gson.*;
import com.lcw.app.domain.bilibili.CommentsInfo;
import com.lcw.app.domain.CrawlerPlatformEnum;
import com.lcw.app.service.CrawlerService;
import com.lcw.app.utils.OkHttpUtils;
import com.lcw.app.vo.BiliVideoVo;
import com.lcw.common.api.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created By lcw332
 * Time : 2020 06 19 18:01
 * Describe :
 **/
@Service
public class CrawlerServiceImpl implements CrawlerService {

    @Override
    public DeferredResult<CommonResult<?>> getComments(String url, CrawlerPlatformEnum platform) {
        DeferredResult<CommonResult<?>> result = new DeferredResult<>();
        handlerGetComment(result,platform);
        BiliVideoVo.Data vo = getBiliVideoInfo(url);
        result.setResult(CommonResult.success(vo));
        Integer avNumber=vo.getAid();
        requestComments(avNumber);
        return result;
    }


    public DeferredResult<CommonResult<?>> handlerGetComment(DeferredResult<CommonResult<?>> result,CrawlerPlatformEnum platform){

        return null;
    }

    /**
     * 获取BiliBili视频相关信息
     * @param originUrl
     * @return
     */
    public BiliVideoVo.Data getBiliVideoInfo(String originUrl){
        // 去掉前缀
        String newAv =StrUtil.removePrefix(originUrl,"https://www.bilibili.com/video/");
        // 组装新请求Url
        String reqUrl = "https://api.bilibili.com/x/web-interface/view?bvid="+newAv;
        // 请求
        String json = OkHttpUtils.httpGet(reqUrl);
        BiliVideoVo vo = new Gson().fromJson(json,BiliVideoVo.class);
        return vo.getData();
    }

    /**
     * 请求评论数据
     * @param avNumber bilibili 视频号
     * @return
     */
    public CommentsInfo requestComments(Integer avNumber){
        // 外接do while循环,直到没有新的页面为止

        // 请求
        String reqUrl = "https://api.bilibili.com/x/v2/reply?&type=1&pn=1&oid="+avNumber;
        String json = OkHttpUtils.httpGet(reqUrl);
        // 转换为JsonObject
        JsonObject obj = (JsonObject) new JsonParser().parse(json);
        // 获取JsonObj下的dataObj 0
        JsonObject dataObj = obj.get("data").getAsJsonObject();
        // 获取dataObj下的pageObj 1
        JsonObject pageObj = dataObj.get("page").getAsJsonObject();
        // 获取dataObj下的repliesArrayObj 1
        JsonArray repliesArray = dataObj.get("replies").getAsJsonArray();
        // replies数组下的每个Obj 1 0
        JsonObject replayObj ;
        // 每个回复Id下的点赞数量
        //TODO 这里的Value应该是一个实体类
        List<Map<Long,Long>> likes = new ArrayList<>();
        // 点赞Map
        Map<Long,Long> likeMap = new HashMap<>();
        // 遍历repliesArray
        for (JsonElement object:repliesArray) {
            replayObj = object.getAsJsonObject();
            likeMap.put(replayObj.get("rpid").getAsLong(),replayObj.get("like").getAsLong());
            likes.add(likeMap);
        }
        // 求出到当前页的点赞数最多的评论，以及评论内容
        List<Long> filterList=
        likes.stream()
                .flatMap(map -> map.values().stream().filter(m -> m > 0))//压平的时候就把为0的数据剔除
                .collect(Collectors.toList());//过滤掉没有点赞的评论Id
        System.out.println(filterList);

        System.out.println(likes);


        return null;
    }


    /**
     * @param filterMap 作为条件的map
     * @param listMap 要过滤的listMap
     */
    public static List<Map<Object, Object>> filterMap(Map<Object, Object> filterMap,
                                                      List<Map<Object, Object>> listMap) {
        return listMap.stream().
            filter(obj -> CollUtil.isNotEmpty(obj.keySet().stream()
                    .filter(oneKey -> filterMap.keySet().contains(oneKey))
                    .collect(Collectors.toList()))
            ).collect(Collectors.toList());
    }


}
