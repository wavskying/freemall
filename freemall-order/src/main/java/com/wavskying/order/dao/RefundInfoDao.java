package com.wavskying.order.dao;

import com.wavskying.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 18:01:42
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
