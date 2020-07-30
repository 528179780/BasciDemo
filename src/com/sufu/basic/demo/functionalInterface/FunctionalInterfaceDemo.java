package com.sufu.basic.demo.functionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 函数式接口Demo
 * @author sufu
 * @date 2020/7/22
 */
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //show(()-> System.out.println("Lambda表达式重写了函数式接口中的method方法,函数式接口作为参数传递"));
        /*
        String msg1 = " hello";
        String msg2 = " word";
        String msg3 = " log";
        String[] array = {"aacc","bbbdas","d","asfasddf","bvdfgy"};
        log(1, msg1+msg2+msg3);
        log(1, () -> msg1+msg2+msg3);
        Arrays.sort(array,getComparator());
        System.out.println(Arrays.toString(array));
         */
        //predicate 函数式接口的使用，用来做判断
        System.out.println(is("??????????????????", (s) -> s.length()>5));

        ConsumerMethod("输出语句", (s)-> System.out.println(s));

    }

    public static void show(MyFunctionalInterface my) {
        my.method();
    }
    /**
     * 日志性能优化案例，使用一个函数式接口拼接字符串，这里用控制台打印模拟
     *
     * @author sufu
     * @date 2020/7/23 20:21
     * @param level 日志等级
     * @param msg 拼接之后的日志信息
     * @return 无返回值
     **/
    public static void log(int level,MessageBuilder msg){
        if (level == 1){
            System.out.println(msg.getMessage());
        }
    }

    /**
     * 日志性能浪费案例的日志函数，这里用控制台打印模拟
     *
     * @author sufu
     * @date 2020/7/23 17:20
     * @param level 日志等级，此处为 1
     * @param msg 日志信息
     * @return 无返回值
     **/
    public static void log(int level,String msg){
        if (level == 1){
            System.out.println(msg);
        }
    }
    /**
     * 定义一个方法，返回一个函数式接口，可以用匿名内部类实现，也可以用Lambda表达式实现
     *
     * @author sufu
     * @date 2020/7/24 10:29
     * @return java.lang.Comparable<java.lang.String>
     **/
    public static Comparator<String> getComparator(){
        return (o1,o2) -> o2.length()-o1.length();
    }
    /**
     *
     * @author sufu
     * @date 2020/7/24 11:38
     * @param s 要判断的字符串
     * @param pre 函数式接口，用Lambda表达式指定判断的具体操作
     * @return boolean 判断的结果
     **/
    public static boolean is(String s,Predicate<String> pre){
        return pre.test(s);
    }
    /**
     *
     * @author sufu
     * @date 2020/7/24 11:43
     * @param str 要消费的数据，此处是一个字符串
     * @param consumer 函数式接口，作用是一个消费者，就是使用给定的泛型T，具体怎么使用由Lambda表达式给出
     **/
    public static void ConsumerMethod(String str,Consumer<String> consumer){
        consumer.accept(str);
    }
}
