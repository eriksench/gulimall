package com.zyx.gulimall.coupon.dao;

import com.zyx.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zyx
 * @date 2023-12-20 15:43:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
