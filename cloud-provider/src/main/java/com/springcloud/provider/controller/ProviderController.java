package com.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yq
 * @date: 2019/11/29 09:45
 * @description:
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/getInfo/{info}")
    public String provider(@PathVariable("info") String info) {
        return "hello: " + info + " !" + " with: " + port;
    }
}
