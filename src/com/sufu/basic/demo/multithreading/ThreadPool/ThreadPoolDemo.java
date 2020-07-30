package com.sufu.basic.demo.multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK1.5之后提供的java.util.concurrent.Executors：线程池的工厂类，用来创建线程池
 *  public static ExecutorService newFixedThreadPool(int nThreads) 创建包含nThreads个线程的线程池，
 *  返回的是一个ExecutorService的一个实现类，可以用ExecutorService来接收（面向接口编程）
 * @author sufu
 * @date 2020/7/21
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //线程池会一直开启，当执行完了一个一个任务之后，线程可以复用程序也没有自动结束，需要调用线程池的shutdown方法才能结束。
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //这里创建了四个任务，但是经过运行发现，最多之后两个任务同时进行，后面的任务都在排队执行，因为代码里指定了线程池的大小。
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        //如果不shutdown的话，程序会一直运行下去
        executorService.shutdown();
        //shutdown之后再提交任务会报异常
        //executorService.submit(new RunnableImpl());

    }
}
