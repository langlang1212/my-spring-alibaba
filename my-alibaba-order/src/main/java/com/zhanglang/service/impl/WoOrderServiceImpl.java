package com.zhanglang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhanglang.entity.WoOrder;
import com.zhanglang.mapper.WoOrderMapper;
import com.zhanglang.service.IWoOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工单 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-11-02
 */
@Service
public class WoOrderServiceImpl extends ServiceImpl<WoOrderMapper, WoOrder> implements IWoOrderService {

}
