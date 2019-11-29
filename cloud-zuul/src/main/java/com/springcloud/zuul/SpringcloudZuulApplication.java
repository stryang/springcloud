package com.springcloud.zuul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: yq
 * @date: 2019/11/29 11:22
 * @description:
 */
@Slf4j
@EnableZuulProxy
@SpringCloudApplication
public class SpringcloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
        log.info("**********************zuul is started.**********************");
    }
}
