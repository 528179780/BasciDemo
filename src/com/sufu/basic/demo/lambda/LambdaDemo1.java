package com.sufu.basic.demo.lambda;

import java.util.Arrays;

/**
 * @author sufu
 * @date 2020/7/22
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        /*
        //匿名内部类实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("匿名内部类创建并且启动了"+Thread.currentThread().getName()+"线程");
            }
        }).start();
        System.out.println("主线程"+Thread.currentThread().getName());
        //使用lambda表达式简化写法，本质同上一样，括号里是传进去的参数
        new Thread(() -> {
            System.out.println("匿名内部类创建并且启动了"+Thread.currentThread().getName()+"线程");
        }).start();
        */
        //---------------------------------------------------------------------
        //调用Cook接口的无参，无返回值的方法，使用Lambda表达式
        invokeCook(()-> System.out.println("make food"));
        //---------------------------------------------------------------------
        //对年龄升序排序
        Person[] people = {
                new Person("张三", 18),
                new Person("李四", 10),
                new Person("王五", 70),
                new Person("赵四", 43)
        };
        Arrays.sort(people, (o1, o2) -> o1.getAge()-o2.getAge());
        for (Person person : people) {
            System.out.println(person);
        }

    }
    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
