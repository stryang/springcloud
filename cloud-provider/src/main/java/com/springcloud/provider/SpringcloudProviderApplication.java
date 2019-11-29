package com.springcloud.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yq
 * @date: 2019/11/29 09:44
 * @description:
 */
@Slf4j
@SpringBootApplication
public class SpringcloudProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderApplication.class, args);
        log.info("**********************provider is started.**********************");
    }
}
