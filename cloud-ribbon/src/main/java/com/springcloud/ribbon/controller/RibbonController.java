package com.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yq
 * @date: 2019/11/29 09:56
 * @description:
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getInfo/{info}")
    public String findById(@PathVariable("info") String info) {
        // 这里用到了RestTemplate的占位符能力
        String result = this.restTemplate.getForObject(
                "http://cloud-provider/provider/getInfo/{info}",
                String.class,
                info
        );
        return result;
    }
}
