package com.sufu.basic.demo.genericity;

/**
 * @author sufu
 * @date 2020/7/12
 */
public class GenericClass<E> {
    private E e;

    public E getStr() {
        return e;
    }

    public void setStr(E str) {
        this.e = str;
    }

    public void print(){
        System.out.println("E : "+e.toString());
    }
    /**
     * 含有泛型的方法，在调用方法的时候确定泛型的数据类型，传递什么类型的参数，泛型就是什么类型
     * @author sufu
     * @date 2020/7/12 17:57
     * @param mvp 泛型参数
     * @return void
     **/
    public static <MVP> void print(MVP mvp){
        System.out.println(mvp);
    }
}
