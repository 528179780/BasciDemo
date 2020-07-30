package com.sufu.basic.demo.multithreading;

/**
 * @author sufu
 * @date 2020/7/14
 */
public class AnonymousInnerMultithreading {
    public static void main(String[] args) {
        // 主线程
        Thread mainThread = Thread.currentThread();
        for (int i=0;i<20;i++) {
            System.out.println(mainThread.getName()+"========>"+i);
        }
        // 第二个线程
        new MyThread1(){
            @Override
            public void run() {
                for (int i=0;i<20;i++) {
                    System.out.println(this.getName()+"========>"+i);
                }
            }
        }.start();

        // 第三个线程，这里不是new了一个接口，而是相当于 Runnable r = new RunnableImpl() 只是这里接口的实现类是一个匿名内部类，
        // 该匿名内部类的实现是在此处实现的
        Runnable r = new Runnable(){
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                for (int i=0;i<20;i++) {
                    System.out.println(currentThread.getName()+"========>"+i);
                }
            }
        };
        new Thread(r).start();

        //第三个线程的另外一种写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                for (int i=0;i<20;i++) {
                    System.out.println(currentThread.getName()+"========>"+i);
                }
            }
        }).start();
    }
}
