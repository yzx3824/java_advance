package com.yzx.annotation;

/**
 * @program: java_advance
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-24 11:51
 *
 * javadoc Work.java
 */
@MyAnno(value = 12, age = 1, name = "zhangsan", per = Person.P2, anno2 = @MyAnno2, strs = {"123", "345"})
@MyAnno3
public class Work {
    @MyAnno3
    public String name = "aaa";
    @MyAnno3
    public void show(){

    }
}
