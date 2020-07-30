package com.sufu.basic.demo.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 注解demo,不改变该类的任何方法，创建任意类型的对象，使用注解实现
 * @since 1.5
 * @author sufu
 * @date 2020/7/26
 */
@Bean(className = "com.sufu.basic.demo.annotation.Book",methodName = "show")
public class AnnotationDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 解析注解 1.获取该类的字节码文件对象
        Class<AnnotationDemo> annotationDemoClass = AnnotationDemo.class;
        System.out.println(annotationDemoClass.isAnnotationPresent(Bean.class));
        // 2.获取注解接口对象，因为在内存中生成了一个该注解接口的实现对象。
        Bean annotation = annotationDemoClass.getAnnotation(Bean.class);
        // 3.调用注解接口的抽象方法获取数据，这里的className()是一个抽象方法，他会返回一个给定的值。
        String className = annotation.className();
        String methodName = annotation.methodName();
        //反射生成对象并调用方法。
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
