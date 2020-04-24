package com.yzx.annotation;

import java.lang.annotation.Annotation;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-24 11:38
 *
 * javac MyAnno.java
 * javap MyAnno.class
 */
public @interface MyAnno {
    int value();
    int age();
    String name();
    Person per();
    MyAnno2 anno2();
    String[] strs();
//    String name() default "张三";

    /*public abstract int show1();
    String show2();

    Person per();
    MyAnno2 anno2();

    String[] strs();*/
}
