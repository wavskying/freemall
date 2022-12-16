package com.wavskying.order.dao;

import com.wavskying.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 18:01:43
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
