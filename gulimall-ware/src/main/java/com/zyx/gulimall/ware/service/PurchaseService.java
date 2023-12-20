package com.zyx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.gulimall.common.utils.PageUtils;
import com.zyx.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author zyx
 * @date 2023-12-20 16:07:39
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

