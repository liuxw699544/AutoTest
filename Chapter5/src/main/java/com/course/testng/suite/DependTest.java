package com.course.testng.suite;

import org.testng.annotations.Test;

public class DependTest {
    //依赖测试，test2依赖于test1,当1运行失败时候test2会被跳过（test1可以作为test2 的前置条件）
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run ");
    }



}
