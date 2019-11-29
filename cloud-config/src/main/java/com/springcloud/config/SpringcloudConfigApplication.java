package com.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: yq
 * @date: 2019/11/29 11:50
 * @description:
 */
@Slf4j
@EnableConfigServer
@SpringCloudApplication
public class SpringcloudConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigApplication.class, args);
        log.info("**********************config is started.**********************");
    }
}
