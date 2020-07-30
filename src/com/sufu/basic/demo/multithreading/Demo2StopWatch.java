package com.sufu.basic.demo.multithreading;

/**
 * @author sufu
 * @date 2020/7/13
 */
public class Demo2StopWatch {
    public static void main(String[] args) {
        for (int i=0;i<60;i++){
            System.out.print(i+" ");
            try {
                //使当前正在执行的线程以指定的毫秒数暂定
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
