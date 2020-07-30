package com.sufu.basic.demo.multithreading.waiting;

/**
 * 等待唤醒demo，线程之间的通信，这里以顾客向老板买包子为例
 * 创建一个顾客线程（消费者），告知老板包子种类和数量，调用wait()方法，进入Waiting状态
 * 创建一个老板线程（生产者），花了5秒做包子，做好之后，调用notify()方法唤醒顾客线程
 * 注意：
 *      顾客和老板必须使用同步代码块包起来，保证等待和唤醒只有一个在执行
 *      同步锁对象必须保证唯一
 *      只有锁对象才能调用wait()和notify()方法
 * @author sufu
 * @date 2020/7/21
 */
public class WaitingDemo {
    public static void main(String[] args) {
        Object lockObject = new Object();
        //匿名内部类创建顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒只能有一个在执行需要使用同步技术
                synchronized (lockObject){
                    System.out.println("告知老板包子数量和种类");
                    try {
                        lockObject.wait(10000);
                        //这个跟后面的是唤醒之后执行的代码
                        System.out.println("吃包子");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        //匿名内部类创建老板线程
        new Thread(){
            @Override
            public void run() {
                System.out.println("开始做包子");
                //睡眠5000毫秒，相当于做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒只能有以个在执行需要使用同步技术
                synchronized (lockObject){
                    System.out.println("包子做完了");
                    lockObject.notify();
                }
            }
        }.start();
    }
}
