package com.springcloud.feign.controller;

import com.springcloud.feign.client.InfoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yq
 * @date: 2019/11/29 10:23
 * @description:
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private InfoFeignClient infoFeignClient;

    @GetMapping("/getInfo/{info}")
    public String getInfo(@PathVariable("info") String info) {
        return infoFeignClient.getInfo(info);
    }
}
