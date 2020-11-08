package com.zhanglang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关要做的事情
 * 1、自定义写predicate 继承AbstractRoutePredicateFactory
 * 2、自定义写filter  局部的继承 AbstractGatewayFilterFactory 全局的实现GlobalFilter,Ordered
 *
 * 源码怎么看
 * 1、找到gateway的源码包
 * 2、查看spring.factories里面的EnableAutoConfiguration
 * 3、所有请求通过DispacherHandler的handle()
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MySpringGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringGatewayApplication.class,args);
    }
}
