package com.zyx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.gulimall.common.utils.PageUtils;
import com.zyx.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zyx
 * @date 2023-12-20 16:07:39
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

