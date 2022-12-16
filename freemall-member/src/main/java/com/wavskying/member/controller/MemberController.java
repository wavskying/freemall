package com.wavskying.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.wavskying.member.feign.CouponFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wavskying.member.entity.MemberEntity;
import com.wavskying.member.service.MemberService;
import com.wavskying.common.utils.PageUtils;
import com.wavskying.common.utils.R;


/**
 * 会员
 *
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-11-16 17:54:50
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeign couponFeign;

    @GetMapping("/test")
    public R test(@RequestParam Map<String, Object> params) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(1l);
        memberEntity.setNickname("张三");
        R couponList = couponFeign.getCouponList(params);
        return R.ok().put("member", memberEntity).put("couponList", couponList);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
