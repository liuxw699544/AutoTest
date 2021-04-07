package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiTreadTest2 {

    @Test
    public void Test1(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());

    }
    @Test
    public void Test2(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());

    }
    @Test
    public void Test3(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());

    }

}
