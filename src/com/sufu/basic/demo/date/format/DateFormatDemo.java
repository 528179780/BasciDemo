package com.sufu.basic.demo.date.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sufu
 * @date 2020/7/12
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date now = new Date();
        String str = dateFormat.format(now);
        System.out.println(str);
        try {
            Date date2 = dateFormat.parse(str+"?这也能转换 ？");
            System.out.println(date2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
