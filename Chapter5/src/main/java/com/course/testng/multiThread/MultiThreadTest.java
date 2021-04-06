package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadTest {
    /*
    * //10个线程
    //@Test(invocationCount = 10) threadPoolSize是线程值，用于各不关联的用例，提高效率
    @Test(invocationCount = 10,threadPoolSize =5 )
    public  void thread(){
        System.out.println(1);
        System.out.printf("Thread ID:%s%n",Thread.currentThread().getId());//把当前的线程id打印出来
    }invocationCount应该是方法被执行次数
    threadPoolSize是线程池
    * */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
