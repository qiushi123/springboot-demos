package com.shitou.springbootdemos.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by qcl on 2019-06-28
 * 微信：2501902696
 * desc: aop类
 */
@Component
@Aspect
public class LogAspect {

    //定义切入点
    @Pointcut("execution(* com.shitou.springbootdemos.aop.*.*(..))")
    public void pp() {

    }

    //前置通知
    @Before(value = "pp()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法开始执行");
    }

    //后置通知
    @After(value = "pp()")
    public void After(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法结束执行");
    }

    //返回通知
    @AfterReturning(value = "pp()", returning = "result")
    public void AfterReturning(JoinPoint jp, Object result) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法返回的值为：" + result);
    }

    //异常通知
    @AfterThrowing(value = "pp()", throwing = "e")
    public void AfterThrowing(JoinPoint jp, Exception e) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法抛出的异常：" + e.getMessage());
    }

    //    //环绕通知
    //    @Around(value = "pp()")
    //    public Object Around(ProceedingJoinPoint pjp) throws Throwable {
    //        System.out.println(pjp.getSignature().getName() + "执行了Around");
    //        return pjp.proceed();
    //    }
}
