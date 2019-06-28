package com.shitou.springbootdemos.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qcl on 2019-06-28
 * 微信：2501902696
 * desc: 验证aop
 */
@RestController
public class AopController {
    @Autowired
    AopDemoService service;

    @GetMapping("/aopGetName")
    public String getName() {
        return service.getName(1);
    }
}
