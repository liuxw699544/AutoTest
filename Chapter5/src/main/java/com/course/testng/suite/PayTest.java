package com.course.testng.suite;

import org.testng.annotations.Test;

public class PayTest {

    @Test(enabled = false)
    public void paySuccess(){
        System.out.println("支付宝支付登录成功");

    }
}
