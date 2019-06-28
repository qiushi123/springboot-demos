package com.shitou.springbootdemos.test;

/**
 * Created by qcl on 2019-06-28
 * 微信：2501902696
 * desc:
 */
public class Test {

    public static void main(String[] a) {
        String value = String.valueOf(85 / 10.0f);
        if (value.contains(".")) {
            String[] split = value.split("\\.");
            System.out.println(split[0]);
            System.out.println(split[1]);
        }


    }
}
