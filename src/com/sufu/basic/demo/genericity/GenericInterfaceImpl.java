package com.sufu.basic.demo.genericity;

/**
 * 含有泛型的接口的第一种使用：定义接口的实现类，实现接口的时候就指定接口的泛型为String
 * @author sufu
 * @date 2020/7/12
 */
public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
