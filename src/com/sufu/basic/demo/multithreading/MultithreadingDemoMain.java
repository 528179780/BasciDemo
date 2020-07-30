package com.sufu.basic.demo.multithreading;

/**
 * @author sufu
 * @date 2020/7/13
 */
public class MultithreadingDemoMain {
    public static void main(String[] args) {
        //JVM执行所有的方法执行都会进入栈内存，会占用一定的空间，main方法就会开启一个线程来执行
        //这是一个新线程执行方法
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        //输出当前正在执行的线程的名称
        System.out.println(Thread.currentThread().getName());

        Person p1 = new Person("苏伏");
        p1.run();
        MyThread2 myThread2 = new MyThread2();
        //以多线程的方式启动这个线程,如果直接调用myThread2的run方法，则执行的是main线程
        new Thread(myThread2).start();
    }
}
