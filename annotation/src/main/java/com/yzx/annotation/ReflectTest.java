package com.yzx.annotation;

import java.lang.reflect.Method;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-24 21:48
 */
@Pro(className = "com.yzx.annotation.Demo2", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 1.解析注解
        // 1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        // 2.获取上边的注解对象
        // 其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
            public class ProImpl implements Pro {
                public String className() {
                    return "com.yzx.annotation.Demo1";
                }
                public String methodName() {
                    return "show";
                }
            }

         */
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }

}
