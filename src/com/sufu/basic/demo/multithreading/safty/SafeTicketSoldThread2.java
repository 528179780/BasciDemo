package com.sufu.basic.demo.multithreading.safty;

/**
 * @author sufu
 * @date 2020/7/15
 */
public class SafeTicketSoldThread2 implements Runnable{
    private static int totalTicket = 100;
    @Override
    public void run() {
        // 注意 如果将synchronized放在run方法上，会锁住整个run方法，直到当前线程执行完毕之后才释放锁对象，因此变成了单线程
        while (true){
            //sold();
            //soldTicket();
            otherSoldTicket();
        }
    }
    public synchronized void sold(){
        //锁对象放在一个局部方法上，执行完了该方法之后就释放锁对象，run中每一次循环之后就会释放锁对象
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
    public static synchronized void soldTicket(){
        //静态方法也能保证线程安全，但是锁对象并不是this，因为静态方法没有对象，静态方法的锁对象是本类的class属性-->class文件对象
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
    public static  void otherSoldTicket(){
        //静态方法的锁对象
        synchronized(SafeTicketSoldThread2.class){
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
