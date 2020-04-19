package com.yzx.reflect;

import com.yzx.reflect.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-19 17:31
 */
public class ReflectDemo004 {
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
            3.获取成员方法们
            * Method[] getMethods()
            * Method getMethod(String name, Class<?>... parameterTypes)
            * Method[] getDeclaredMethods()
            * Method getDeclaredMethod(String name, Class<?>... parameterTypes)
         */
        // 获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p, "饭");

        System.out.println("----------------------");

        // 获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
//            method.setAccessible(true);
        }


        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        
        
        // 获取类名
        String name = personClass.getName();
        System.out.println(name); //com.yzx.reflect.domain.Person

    }
}
