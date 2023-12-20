package com.zyx.gulimall.order.dao;

import com.zyx.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zyx
 * @date 2023-12-20 16:02:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
