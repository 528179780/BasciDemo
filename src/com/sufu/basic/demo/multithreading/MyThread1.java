package com.sufu.basic.demo.multithreading;

/**
 * 1.创建新的线程类，需要重写其中的 run() 方法
 * 2.设置线程任务（该线程要干什么）
 * 3.创建Thread的子类对象
 * 4.调用Thread类中的start()方法，开启新的线程，执行run方法
 *
 * 结果是两个线程并发地运行，多次启动同一个线程是非法的，特别是一个线程已经结束执行后，不能再重新启动。
 * @author sufu
 * @date 2020/7/13
 */
public class MyThread1 extends Thread{
    private static int COUNT = 20;
    @Override
    public void run() {
        //打印线程名称
        System.out.println(this.getName());
        for(int i=0;i<COUNT;i++){
            System.out.println("run 1 ========>"+i);
        }
    }
}
