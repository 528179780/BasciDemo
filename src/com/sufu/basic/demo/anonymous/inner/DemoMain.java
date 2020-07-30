package com.sufu.basic.demo.anonymous.inner;

/**
 * 测试主类
 * @author sufu
 * @date 2020/7/12
 */
public class DemoMain {
    public static void main(String[] args) {
        // 使用一个实现类来调用方法
        MyInterface myInterface1 = new MyInterfaceImpl();
        myInterface1.method();
        // 匿名内部类的定义，实际上这里new接口后面的大括号里面的内容和写一个实现类中大括号里面的内容是一样的
        // 前面的 MyInterface 不是它的名字，而是接口名字，这个类没有名字，因此叫匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类中重写method方法1");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类中重写method方法2");
            }
        };
        myInterface.method();
        myInterface.method2();

        //使用了匿名内部类，而且省略了对象名称
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("省略对象名称的匿名内部类中重写method方法1");
            }

            @Override
            public void method2() {
                System.out.println("省略对象名称的匿名内部类中重写method方法2");
            }
        }.method();
    }
}
