package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "pays")
    public void test1(){
        System.out.println("这是pays组方法");

    }
    //将两个方法进行分组执行
    @Test(groups = "payf")
    public void test2(){
        System.out.println("这是payf组方法1");
    }
    @Test(groups = "payf")
    public void test3(){
        System.out.println("这是payf组方法2");

    }
    //添加分组注解
    @BeforeGroups("payf")
    public void beforeGrouponpay(){
        System.out.println("在payf1运行之前的方法");

    }
    //添加分组注解
    @AfterGroups("payf")
    public void afterGroupsonpay(){
        System.out.println("在payf1运行之后的方法");

    }

}
