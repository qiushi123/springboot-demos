package com.shitou.springbootdemos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qcl on 2019-06-29
 * 微信：2501902696
 * desc:
 */
@RestController
public class ConfigController {

    @Autowired
    LimitConfig limitConfig;

    @GetMapping("/limitConfig")
    public String limitConfig() {
        return "说明：" + limitConfig.getDescription();
    }
}
