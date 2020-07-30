package com.sufu.basic.demo.genericity;

/**
 * 含有泛型的接口的第二种使用：接口使用什么泛型，类就是用什么泛型
 * 相当于定义了一个含有泛型的类
 * @author sufu
 * @date 2020/7/12
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{

    @Override
    public void print(I i) {
        System.out.println(i);
    }
}
