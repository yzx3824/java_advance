package com.yzx.annotation.Demo;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-24 22:07
 *
 * 自定义的计算器类
 */
public class Calculator {
    // 加法
    @Check
    public void add() {
        String i = null;
        i.toString();
        System.out.println("1 + 0 = " + (1 + 0));
    }
    // 减法
    @Check
    public void sub() {
        System.out.println("1 + 0 = " + (1 + 0));
    }
    // 乘法
    @Check
    public void mul() {
        System.out.println("1 * 0 = " + (1 * 0));
    }
    // 除法
    @Check
    public void div() {
        System.out.println("1 / 0 = " + (1 / 0));
    }

    public void show() {
        System.out.println("永无止境...");
    }
}
