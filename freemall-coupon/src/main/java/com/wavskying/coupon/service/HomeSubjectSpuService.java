package com.wavskying.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 17:39:06
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

