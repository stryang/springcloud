package com.springcloud.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: yq
 * @date: 2019/11/29 10:22
 * @description:
 */
@Slf4j
@EnableFeignClients
@EnableCircuitBreaker
@SpringCloudApplication
public class SpringcloudFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignApplication.class, args);
        log.info("**********************feign is started.**********************");
    }
}
