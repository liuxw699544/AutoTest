package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
    * 什么时候会用到异常测试
    * 在我们期望结果为某一个异常的时候
    * 比如：我们传入了某些不合法的参数的时候，程序抛出异常
    * 也就是说我的预期结果就是这个异常
    * */
    //这是个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaild(){
        System.out.println("这是个失败的异常测试");
    }
    //这是个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是个成功的异常测试");
        throw  new RuntimeException();

    }





}
