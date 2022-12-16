package com.wavskying.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 17:39:06
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

