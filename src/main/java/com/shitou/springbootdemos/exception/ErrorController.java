package com.shitou.springbootdemos.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qcl on 2019-06-12
 * 微信：2501902696
 * desc: 验证能不能捕获到全局异常
 */
@RestController
public class ErrorController {

    @GetMapping("/errorTest")
    public void error() {
        int a = 5 / 0;
    }
}
