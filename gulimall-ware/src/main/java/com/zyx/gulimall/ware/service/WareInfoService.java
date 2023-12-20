package com.zyx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.gulimall.common.utils.PageUtils;
import com.zyx.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zyx
 * @date 2023-12-20 16:07:38
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

