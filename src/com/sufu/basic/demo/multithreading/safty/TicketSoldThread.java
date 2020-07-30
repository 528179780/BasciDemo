package com.sufu.basic.demo.multithreading.safty;

/**
 * @author sufu
 * @date 2020/7/14
 */
public class TicketSoldThread implements Runnable{
    private int totalTicket = 100;
    @Override
    public void run() {
        while (true){
            if(totalTicket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 线程 "+"正在卖第 "+totalTicket+" 张票");
                totalTicket--;
            }
        }
    }
}
