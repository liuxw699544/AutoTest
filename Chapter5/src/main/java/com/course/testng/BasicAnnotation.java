package com.course.testng;

import org.testng.annotations.*;


public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
//    @Test
//    public void  testCase1(){
//        System.out.println("这是测试用例1");
//    }
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("beforeMethod是在测试方法之前运行的");
//
//    }
//    @Test
//    public void  testCase2(){
//
//        System.out.println("这是测试用例2");
//
//    }
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("AfterMethod是在测试方法之后运行的");
//    }

    @BeforeSuite
    public void beforeSuite(){

        System.out.println("beforeSuit测试套件在哪个位置执行");
    }

    @AfterSuite
    public void afterSuite(){

        System.out.println("afterSuit测试套件在哪个位置执行");
    }



}
