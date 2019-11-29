package com.springcloud.feign.client.fallback;

import com.springcloud.feign.client.InfoFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: yq
 * @date: 2019/11/29 11:13
 * @description:
 */
@Slf4j
@Component
public class InfoFeignFallback implements InfoFeignClient {
    @Override
    public String getInfo(String info) {
        log.info("熔断开启，返回默认信息");
        return "熔断开启，返回默认信息";
    }
}
