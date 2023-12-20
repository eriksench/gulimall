package com.zyx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.gulimall.common.utils.PageUtils;
import com.zyx.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zyx
 * @date 2023-12-20 16:07:39
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

