package com.wavskying.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 17:39:06
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

