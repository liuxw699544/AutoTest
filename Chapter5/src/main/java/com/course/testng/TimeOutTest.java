package com.course.testng;

import org.testng.annotations.Test;
//超时测试
public class TimeOutTest {
    @Test(timeOut = 3000)//单位是毫秒值
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);

    }
    @Test(timeOut = 2000)//设置睡眠3秒，但是2秒时候未返回结果，所以就是失败了
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
