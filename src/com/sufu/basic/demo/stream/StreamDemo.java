package com.sufu.basic.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流式编程Demo
 * @author sufu
 * @date 2020/7/24
 */
public class StreamDemo {
    public static void main(String[] args) {
//        String[] strings = {"aaabb","bbaaa","aaacc","aaazx","aaagj"};
//        List<String> list = Arrays.asList(strings);
//        String ss = "?";
//        //用stream流的方式过滤，遍历来 代替循环, 也是获取流的第一种方法
//        list.stream()
//                .filter(s -> s.startsWith("aa"))
//                .forEach(s -> System.out.println(s+ss));
//        //获取流的第二种方式
//        Stream.of(strings)
//                .filter(s -> s.startsWith("aa"))
//                .forEach(s -> System.out.println(s+ss));
//        long count = list.stream()
//                .filter(s -> s.startsWith("aa")).count();
//        System.out.println(count);

//        Stream.of("1","2","3","4","5")
//                .map((s) -> Integer.parseInt(s))
//                .forEach((i)-> System.out.println(i));

//        Stream.of("1","2","3","4","5")
//                .limit(3)
//                .forEach((s)-> System.out.println(s));

//        Stream.of("1","2","3","4","5")
//                .skip(3)
//                .forEach((s)-> System.out.println(s));

        Stream<String> stringStream = Stream.of("1");
        Stream<String> stringStream1 = Stream.of("2");
        Stream.concat(stringStream, stringStream1).forEach((s)-> System.out.println(s));
    }
}
