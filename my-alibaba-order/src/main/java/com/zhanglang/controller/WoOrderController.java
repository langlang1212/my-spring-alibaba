package com.zhanglang.controller;


import com.zhanglang.entity.WoOrder;
import com.zhanglang.mapper.WoOrderMapper;
import com.zhanglang.res.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 工单 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-11-02
 */
@RestController
@RequestMapping("/woOrder")
public class WoOrderController {

    @Autowired
    private WoOrderMapper woOrderMapper;

    @GetMapping("/order/{orderNo}")
    public Result getOrder(@PathVariable("orderNo") String orderNo){
        Map<String,Object> map = new HashMap<>();
        if(StringUtils.isNotBlank(orderNo))
            map.put("order_no",orderNo);
        List<WoOrder> order = woOrderMapper.selectByMap(map);
        return Result.builder().code(200).msg("请求成功!").data(order).build();
    }
}
