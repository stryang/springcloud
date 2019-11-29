package com.springcloud.feign.client.config;

import feign.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author: yq
 * @date: 2019/11/29 11:12
 * @description:
 */
@Configurable
public class InfoFeignConfig {
    /**
     * 配置日志级别，可以用此方式，也可通过配置文件指定
     * NONE【性能最佳，适用于生产】：不记录任何日志（默认值）。
     * BASIC【适用于生产环境追踪问题】：仅记录请求方法、URL、响应状态代码以及执行时间。
     * HEADERS：记录BASIC级别的基础上，记录请求和响应的header。
     * FULL【比较适用于开发及测试环境定位问题】：记录请求和响应的header、body和元数据。
     */
    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}
