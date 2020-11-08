package com.zhanglang.filter;

import com.zhanglang.filter.config.MyPartGatewayFilterFactoryConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 自定义一个局部的过滤器
 * 局部过滤器，在请求经过网关的时候可以插手业务处理
 */
@Slf4j
@Component
public class MyPartGatewayFilterFactory extends AbstractGatewayFilterFactory<MyPartGatewayFilterFactoryConfig> {
    public MyPartGatewayFilterFactory(){
        super(MyPartGatewayFilterFactoryConfig.class);
    }
    @Override
    public GatewayFilter apply(MyPartGatewayFilterFactoryConfig config) {
        return (exchange, chain) -> {
            log.info("自定义局部filter...");
            log.info("name:{}",config.getName());
            log.info("value:{}",config.getValue());
            return chain.filter(exchange);
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("name","value");
    }
}
