package com.sufu.basic.demo.multithreading;

/**
 * @author sufu
 * @date 2020/7/13
 */
public class Person {
    private String name;
    private int age;
    private String sex;
    private static int COUNT = 20;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void run(){
        for (int i =0;i<COUNT;i++){
            System.out.println(name+" =======> "+i);
        }
    }
}









