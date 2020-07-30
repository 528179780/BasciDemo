package com.sufu.basic.demo.reflect;

import com.sufu.basic.demo.lambda.Person;

/**
 * 获取class的三种方式
 * @author sufu
 * @date 2020/7/25
 */
public class GetClassDemo {
    public static void main(String[] args) throws Exception{
        // 1. 用Class类的静态方法获取
        Class aClass = Class.forName("com.sufu.basic.demo.lambda.Person");
        System.out.println(aClass);
        // 2. 类名.class
        System.out.println(Person.class);
        //3. 对象.getClass()方法获取
        Person p = new Person();
        System.out.println(p.getClass());
    }
}
