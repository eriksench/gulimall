package com.zyx.gulimall.ware.dao;

import com.zyx.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zyx
 * @date 2023-12-20 16:07:39
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
