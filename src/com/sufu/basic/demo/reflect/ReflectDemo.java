package com.sufu.basic.demo.reflect;

import com.sufu.basic.demo.lambda.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射Demo
 * @author sufu
 * @date 2020/7/25
 */
public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // 获取class对象
        Person p = new Person("张三",19);
        Class aClass = p.getClass();


        // 获取所有的public修饰的成员变量
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }


        //获取所有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        // 获取第一个成员变量的value,访问非public的成员变量需要 忽略访问权限修饰的安全检查
        Field declaredField = declaredFields[0];
        //忽略访问权限修饰的安全检查 （暴力反射），否则会报IllegalAccessException异常
        declaredField.setAccessible(true);
        Object o = declaredField.get(p);
        System.out.println(o);

        //获取构造方法
        Constructor constructor = aClass.getConstructor(String.class, int.class);
        Object per = constructor.newInstance("张三", 20);
        System.out.println(per);
        //如果使用空参数数的构造方法创建对象，可以简化操作
        Constructor constructor1 = aClass.getConstructor();
        Object per1 = constructor1.newInstance();
        System.out.println(per1);
        //可简化为如下
        Person p1 = (Person) aClass.newInstance();
        System.out.println(p1);

        Method eatMethod = aClass.getMethod("eat");
        System.out.println(eatMethod);
        //获取方法对象之后，执行方法，需要一个Person实体类
        eatMethod.invoke(p);

        Method eat = aClass.getMethod("eat", String.class);
        Object res = eat.invoke(p, "番茄");
        System.out.println(res);


    }
}
