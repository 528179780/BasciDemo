package com.sufu.basic.demo.genericity;

/**
 * @author sufu
 * @date 2020/7/12
 */
public class DemoMain {
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<>();
        gc.setStr("ttttttttttttt");
        gc.print();
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setStr(5);
        gc2.print();
        GenericClass.print("test msg");
        GenericClass.print(10086);
        GenericInterfaceImpl g = new GenericInterfaceImpl();
        g.print("???");
        GenericInterfaceImpl2<String> genericInterfaceImpl2 = new GenericInterfaceImpl2<>();
        genericInterfaceImpl2.print("!!!!!");
    }
}
