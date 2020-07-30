package com.sufu.basic.demo.multithreading.safty;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用同步代码块来保证线程安全
 * @author sufu
 * @date 2020/7/15
 */
public class SafeTicketSoldThread3 implements Runnable{
    private int totalTicket = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            sold();
        }
    }
    public void sold(){
        lock.lock();
        try {
            if(totalTicket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 线程 "+"正在卖第 "+totalTicket+" 张票");
                totalTicket--;
            }
        }finally {
            lock.unlock();
        }
    }
}
