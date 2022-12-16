package com.wavskying.member.dao;

import com.wavskying.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 17:54:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
