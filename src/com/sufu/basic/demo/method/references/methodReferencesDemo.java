package com.sufu.basic.demo.method.references;

/**
 * @author sufu
 * @date 2020/7/24
 */
public class methodReferencesDemo {
    public static void main(String[] args) {
        String s = "???";
        printData(System.out::println);
    }
    public static void printData(Printable p){
        p.print("str");
    }
}
