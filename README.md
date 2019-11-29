# springcloud原生组件整理例子
### 介绍

    springcloud版本：Greenwich.SR3
    springboot版本：2.1.9.RELEASE
    
    注册中心：cloud-eureka
    配置中心：cloud-config
    服务网关：cloud-zuul
    负载均衡：cloud-ribbon
    远程调用：cloud-feign（集成Netflix-ribbon负载均衡、Netflix-hystrix断路器，熔断机制，服务降级）
    服务提供方：cloud-provider
    
### clone后
    1、使用maven下载依赖包
    mvn install
    2、idea安装插件lombok  
