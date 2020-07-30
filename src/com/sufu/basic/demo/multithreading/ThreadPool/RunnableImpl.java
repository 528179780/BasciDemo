package com.sufu.basic.demo.multithreading.ThreadPool;

/**
 * @author sufu
 * @date 2020/7/21
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getName());
    }
}
