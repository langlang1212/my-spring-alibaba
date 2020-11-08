package com.zhanglang.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.zhanglang.utils.SentinelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/sentinel")
public class HelloWorldController {

    @PostConstruct
    public void init(){
        List<FlowRule> flowRules = new ArrayList<>();

        FlowRule flowRule1 = new FlowRule();
        flowRule1.setResource("test01"); // 设置资源名字
        flowRule1.setGrade(RuleConstant.FLOW_GRADE_QPS); // 设置qps流控
        flowRule1.setCount(1); // 默认1秒钟只能一次

        FlowRule flowRule2 = new FlowRule();
        flowRule2.setResource("test02"); // 设置资源名字
        flowRule2.setGrade(RuleConstant.FLOW_GRADE_QPS); // 设置qps流控
        flowRule2.setCount(1); // 默认1秒钟只能一次

        FlowRule flowRule3 = new FlowRule();
        flowRule3.setResource("test03"); // 设置资源名字
        flowRule3.setGrade(RuleConstant.FLOW_GRADE_QPS); // 设置qps流控
        flowRule3.setCount(1); // 默认1秒钟只能一次

        flowRules.add(flowRule1);
        flowRules.add(flowRule2);
        flowRules.add(flowRule3);
        FlowRuleManager.loadRules(flowRules);

    }

    @RequestMapping("/test01")
    public String test01(){
        Entry entry = null;
        try {
            entry = SphU.entry("test01");
            System.out.println("呵呵.....");
        } catch (BlockException e) {
            return "被限流了...";
        }
        return "success";
    }

    @RequestMapping("/test02")
    @SentinelResource(value = "test02",blockHandler = "test02BlockMethod")
    public String test02(){
        log.info("test02 业务方法...");
        return "success";
    }

    /**
     * 这里是业务方法得熔断方法，返回类型和参数要和业务方法test02一致，这里可以多一个异常参数
     * @param e
     * @return
     */
    public String test02BlockMethod(BlockException e){
        log.info("被限流了...");
        return "被限流了...";
    }

    @RequestMapping("/test03")
    @SentinelResource(value = "test03",blockHandler = "test03BlockMethod",blockHandlerClass = SentinelUtil.class)
    public String test03(){
        log.info("test03 业务方法...");
        return "success";
    }
}
