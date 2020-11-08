package com.zhanglang.predicate;

import com.zhanglang.predicate.config.BetweenTimeConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 自定义断言
 * 只有在开始时间和结束时间之间的请求才能通过
 */
@Component
@Slf4j
public class BetweenTimeRoutePredicateFactory extends AbstractRoutePredicateFactory<BetweenTimeConfig> {

    public BetweenTimeRoutePredicateFactory() {
        super(BetweenTimeConfig.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(BetweenTimeConfig config) {
        LocalTime startTime = config.getStartTime();
        LocalTime endTime = config.getEndTime();
        return exchange -> {
            log.info("进入自定义断言...");
            LocalTime now = LocalTime.now();
            return now.isAfter(startTime) && now.isBefore(endTime);
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("startTime", "endTime");
    }
}
