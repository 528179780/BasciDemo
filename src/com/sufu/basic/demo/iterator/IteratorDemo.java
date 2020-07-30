package com.sufu.basic.demo.iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Iterator demo
 * @author sufu
 * @date 2020/7/12
 */
public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Iterator<String> iterator1 = list.iterator();iterator1.hasNext();){
            System.out.println(iterator1.next());
        }
        for (String s : list){
            System.out.println(s);
        }
    }
}
