package com.yzx.reflect;

import com.yzx.reflect.domain.Person;

import java.lang.reflect.Field;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-19 17:31
 */
public class ReflectDemo002 {
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
            1.获取成员变量们
                * Field[] getFields()
                * Field getField(String name)
                * Field[] getDeclaredFields()
                * Field getDeclaredField(String name)
         */
        // 1.Field[] getFields() 获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-----------------------");
        // 2.Field getField(String name)
        Field a = personClass.getField("a");
        Person p = new Person();
        // 获取成员变量a的值
        Object value = a.get(p);
        System.out.println(value);
        // 设置a的值
        a.set(p, "张三");
        System.out.println(p);

        System.out.println("======================");
        // 3.Field[] getDeclaredFields() 获取所有的成员变量,不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        // 4.Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); //暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
        d.set(p, "哈哈");
        System.out.println(p);

    }
}
