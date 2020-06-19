package com.lcw.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created By lcw332
 * Time : 2020 06 18 22:21
 * Describe : oauth模块启动类
 **/
@EnableDiscoveryClient
@EnableAuthorizationServer
@SpringBootApplication
public class OauthApp {
    public static void main(String[] args) {
        SpringApplication.run(OauthApp.class,args);
    }
}
