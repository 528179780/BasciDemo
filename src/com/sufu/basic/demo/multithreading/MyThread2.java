package com.sufu.basic.demo.multithreading;

/**
 * @author sufu
 * @date 2020/7/13
 */
public class MyThread2 implements Runnable{
    private static int COUNT = 10;
    @Override
    public void run() {
        //打印线程名称
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<COUNT;i++){
            System.out.println("run 2 ========>"+i);
        }
    }
}
