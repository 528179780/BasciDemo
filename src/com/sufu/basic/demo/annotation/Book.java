package com.sufu.basic.demo.annotation;

/**
 * @author sufu
 * @date 2020/7/26
 */
public class Book {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("show.............");
    }
}
