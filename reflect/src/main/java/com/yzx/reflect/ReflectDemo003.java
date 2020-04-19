package com.yzx.reflect;

import com.yzx.reflect.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-19 17:31
 */
public class ReflectDemo003 {
    /**
     ** 获取功能
     *             1.获取成员变量们
     *                 * Field[] getFields()
     *                 * Field getField(String name)
     *                 * Field[] getDeclaredFields()
     *                 * Field getDeclaredField(String name)
     *             2.获取构造方法们
     *                 * Constructor<?>[] getConstructors()
     *                 * Constructor<T> getConstructor(Class<?>... parameterTypes)
     *                 * Constructor<?>[] getDeclaredConstructors()
     *                 * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
     *             3.获取成员方法们
     *                 * Method[] getMethods()
     *                 * Method getMethod(String name, Class<?>... parameterTypes)
     *                 * Method[] getDeclaredMethods()
     *                 * Method getDeclaredMethod(String name, Class<?>... parameterTypes)
     *             4.获取类名
     *                 * String getName()
     *
     */
    public static void main(String[] args) throws Exception {
        // 0.获取Person的class队形
        Class personClass  = Person.class;
        /*
            2.获取构造方法们
            * Constructor<?>[] getConstructors()
            * Constructor<T> getConstructor(Class<?>... parameterTypes)
            * Constructor<?>[] getDeclaredConstructors()
            * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
         */
        // Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        // 创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("------------------");
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        // 创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

//        constructor1.setAccessible(true);
    }
}
