package com.zyx.gulimall.order.dao;

import com.zyx.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zyx
 * @date 2023-12-20 16:02:30
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
