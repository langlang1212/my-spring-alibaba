package com.zhanglang.utils;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SentinelUtil {
    /**
     * 这里必须用static方法
     * @param e
     * @return
     */
    public static String test03BlockMethod(BlockException e){
        log.info("被限流了...");
        return "被限流了...";
    }
}
