package com.zyx.gulimall.member.dao;

import com.zyx.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zyx
 * @date 2023-12-20 15:51:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
