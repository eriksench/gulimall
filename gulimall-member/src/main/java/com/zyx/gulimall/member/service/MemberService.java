package com.zyx.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.gulimall.common.utils.PageUtils;
import com.zyx.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zyx
 * @date 2023-12-20 15:51:33
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

