package com.zhanglang.predicate.config;

import lombok.Data;

import java.time.LocalTime;

@Data
public class BetweenTimeConfig {

    private LocalTime startTime;

    private LocalTime endTime;
}
