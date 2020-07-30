package com.sufu.basic.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 自定义注解的几种抽象方法的返回值的要求
 * 这些抽象方法一般叫做属性，但是其实是方法，因为在使用的时候需要给它赋值，像属性的操作方式，所以称作属性
 * @author sufu
 * @date 2020/7/26
 */
public @interface MyAnno {
    String name() default "张三";
    int age() default 18;
    Person person();
    MyAnno2 anno();
//
//    String[] show11();
//    int[] show22();
//    Person[] show33();
//    MyAnno2[] show44();
}
