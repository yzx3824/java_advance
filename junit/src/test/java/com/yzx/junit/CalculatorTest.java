package com.yzx.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-19 16:30
 */
public class CalculatorTest {

    /**
     * 初始化方法:
     *  用于资源申请，所有测试方法在执行之前会先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源方法:
     *  在所有测试方法执行完之后,都会自动执行该方法
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd() {
        System.out.println("我被执行了...");
        // 1.创建计算器对象
        Calculator c = new Calculator();
        // 2.调用add方法
        int result = c.add(1, 2);
//        System.out.println(result);

        // 3.断言 断言这个结果是3
        Assert.assertEquals(3, result);
    }

    /**
     * 测试sub方法
     */
    @Test
    public void testSub() {
        // 1.创建计算器对象
        Calculator c = new Calculator();
        // 2.调用add方法
        int result = c.sub(1, 2);
//        System.out.println(result);

        // 3.断言 断言这个结果是3
        Assert.assertEquals(-1, result);
    }
}
