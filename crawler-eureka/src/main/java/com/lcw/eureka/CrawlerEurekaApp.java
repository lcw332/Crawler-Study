package com.lcw.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created By lcw332
 * Time : 2020 06 18 20:03
 * Describe : Eureka服务发现与注册中心
 **/
@EnableEurekaServer
@SpringBootApplication
public class CrawlerEurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(CrawlerEurekaApp.class,args);
    }
}
