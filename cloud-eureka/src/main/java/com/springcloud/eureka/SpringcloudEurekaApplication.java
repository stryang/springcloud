package com.springcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: yq
 * @date: 2019/11/28 17:39
 * @description:
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaApplication.class, args);
        log.info("**********************Eureka server is started.**********************");
    }
}
