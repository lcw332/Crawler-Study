package com.lcw.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created By lcw332
 * Time : 2020 06 18 23:32
 * Describe :
 **/
//@EnableDiscoveryClient
@SpringBootApplication
public class CrawlerApp {
    public static void main(String[] args) {
        SpringApplication.run(CrawlerApp.class,args);
    }
}
