package com.springcloud.feign.client;

import com.springcloud.feign.client.config.InfoFeignConfig;
import com.springcloud.feign.client.fallback.InfoFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: yq
 * @date: 2019/11/29 10:25
 * @description:
 */
@FeignClient(value = "cloud-provider", configuration = InfoFeignConfig.class, fallback = InfoFeignFallback.class)
public interface InfoFeignClient {

    @GetMapping("/provider/getInfo/{info}")
    String getInfo(@PathVariable("info") String info);

}