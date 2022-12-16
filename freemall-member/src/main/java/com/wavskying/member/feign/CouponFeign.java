package com.wavskying.member.feign;

import com.wavskying.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author: hbw
 **/
@FeignClient(value = "freemall-coupon",path = "coupon/coupon")
public interface CouponFeign {

    @GetMapping("/list")
    public R getCouponList(@RequestParam Map<String, Object> params);
}
