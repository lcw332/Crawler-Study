package com.lcw.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created By lcw332
 * Time : 2020 06 18 20:42
 * Describe : 用户服务Application
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableCassandraRepositories({"com.lcw.dao.cassandra"})
@EnableJpaRepositories({"com.lcw.dao"})
public class MemberApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class,args);
    }
}
