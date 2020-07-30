package com.sufu.basic.demo.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 假设这是一个框架类,不能改变该类的任何代码，就创建任意对象，执行任意方法。可以引入配置文件。
 * @author sufu
 * @date 2020/7/26
 */
public class ReflectExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 创建Properties对象
        Properties pro = new Properties();
        // 这个classloader可以找到src目录下的类，也可以找到配置文件
        ClassLoader classLoader = ReflectExample.class.getClassLoader();
        // getResourceAsStream方法将资源文件读取为输入流，然后交由Properties类加载配置文件
        InputStream resourceAsStream = classLoader.getResourceAsStream("com\\sufu\\basic\\demo\\reflect\\config.properties");
        pro.load(resourceAsStream);
        //获取配置文件中的属性
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //加载Class对象
        Class<?> aClass = Class.forName(className);
        //实例化一个无参构造类
        Object o = aClass.newInstance();
        //获取指定的方法
        Method method1 = aClass.getMethod(methodName);
        method1.invoke(o);
    }
}
