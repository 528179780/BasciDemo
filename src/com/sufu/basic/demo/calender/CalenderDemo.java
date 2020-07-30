package com.sufu.basic.demo.calender;

import java.util.Calendar;

/**
 * @author sufu
 * @date 2020/7/12
 */
public class CalenderDemo {
    public static void main(String[] args) {
        //创建默认时区的Calender的一个子类
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
