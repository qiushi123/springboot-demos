package com.shitou.springbootdemos.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qcl on 2019-06-28
 * 微信：2501902696
 * desc:
 */
public class Test {

    public static void main(String[] a) {

        long nowtime = 1546484462;//某个时间戳;
        Date date = new Date(nowtime * 1000);
        SimpleDateFormat format = new SimpleDateFormat("M月dd日 HH:mm");
        String nowDateString = format.format(date);
        System.out.println(nowDateString);


    }
}
