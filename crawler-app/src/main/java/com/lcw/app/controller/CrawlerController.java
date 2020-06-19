package com.lcw.app.controller;

import com.lcw.app.domain.CrawlerPlatformEnum;
import com.lcw.app.service.CrawlerService;
import com.lcw.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created By lcw332
 * Time : 2020 06 19 17:58
 * Describe :
 **/
@RestController
@RequestMapping("/api/v1/crawler")
public class CrawlerController {

    final
    CrawlerService crawlerService;

    @Autowired
    public CrawlerController(CrawlerService crawlerService) {
        this.crawlerService = crawlerService;
    }


    @GetMapping("/getComments/{platform}")
    public DeferredResult<CommonResult<?>> getComments(@RequestParam("url")String url,
                                                      @PathVariable CrawlerPlatformEnum platform){
        return crawlerService.getComments(url,platform);
    }
}
