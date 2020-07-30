package com.sufu.basic.demo.multithreading.safty;

/**
 * 多线程卖票demo
 * @author sufu
 * @date 2020/7/14
 */
public class TicketSoldDemo {
    public static void main(String[] args) {
        //创建一个实现类，传递给三个进程对象来实现多线程
        TicketSoldThread ticketSoldThread = new TicketSoldThread();
        SafeTicketSoldThread1 s1 = new SafeTicketSoldThread1();
        SafeTicketSoldThread2 s2 = new SafeTicketSoldThread2();
        SafeTicketSoldThread3 s3 = new SafeTicketSoldThread3();
//        sold(s1);
//        sold(s2);
        sold(s3);
    }
    public static void sold(Runnable r){
        //创建三个线程，分别售票
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
}
