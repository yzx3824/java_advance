package com.yzx.reflect;

import com.yzx.reflect.domain.Person;
import com.yzx.reflect.domain.Student;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-19 17:04
 */
public class ReflectDemo001 {
    /**
     * 获取Class对象的方式
     *         1.Class.forName("全类名"):将字节码文件加载进内存,返回Class对象
     *         2.类名.class:通过类名的属性class获取
     *         3.对象.getClass():getClass()方法在Object类中定义
     */
    public static void main(String[] args) throws Exception {
        // 1.Class.forName("全类名")
        Class cls = Class.forName("com.yzx.reflect.domain.Person");
        System.out.println(cls);

        // 2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        // == 比较三个对象
        System.out.println(cls == cls2);  // true
        System.out.println(cls == cls3);  // true
        System.out.println(cls2 == cls3);  // true

        Class c = Student.class;
        System.out.println(c == cls);
    }
}
