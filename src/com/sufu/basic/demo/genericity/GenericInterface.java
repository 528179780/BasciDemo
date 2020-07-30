package com.sufu.basic.demo.genericity;

/**
 * @author sufu
 * @date 2020/7/12
 */
public interface GenericInterface<I> {
    /**
     * 打印该泛型的接口
     * @author sufu
     * @date 2020/7/12 18:04
     * @param i 泛型参数
     * @return void
     **/
    void print(I i);
}
