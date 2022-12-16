package com.wavskying.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 18:09:56
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

