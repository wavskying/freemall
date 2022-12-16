package com.wavskying.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 17:54:49
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

