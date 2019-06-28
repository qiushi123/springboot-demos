package com.shitou.springbootdemos.aop;

import org.springframework.stereotype.Service;

/**
 * Created by qcl on 2019-06-28
 * 微信：2501902696
 * desc: 被aop监视的类
 */
@Service
public class AopDemoService {
    public String getName(int id) {
        return "我是编程小石头";
    }
}
