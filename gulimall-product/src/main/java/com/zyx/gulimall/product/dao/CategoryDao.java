package com.zyx.gulimall.product.dao;

import com.zyx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zyx
 * @date 2023-12-20 15:47:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
