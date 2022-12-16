package com.wavskying.freemallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.freemallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-10-08 21:31:32
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

