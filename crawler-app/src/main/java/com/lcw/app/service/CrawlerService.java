package com.lcw.app.service;

import com.lcw.app.domain.CrawlerPlatformEnum;
import com.lcw.common.api.CommonResult;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created By lcw332
 * Time : 2020 06 19 18:01
 * Describe :
 **/
public interface CrawlerService {

    DeferredResult<CommonResult<?>> getComments(String url, CrawlerPlatformEnum platform);
}
