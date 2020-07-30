package com.sufu.basic.demo.anonymous.inner;

/**
 * Demo实现类,如果接口的实现类，或者父类的子类只需要使用唯一的一次，
 * 可以用匿名内部类实现，不用专门写一个实现类。
 * @author sufu
 * @date 2020/7/12
 */
public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("实现类重写了接口中的方法1");
    }

    @Override
    public void method2() {
        System.out.println("实现类重写了接口中的方法2");
    }
}
