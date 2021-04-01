package com.course.testng.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class PayTest {
    //忽略测试就是@Test(enabled = false/true)
    @Test(enabled = false)
    public void paySuccess(){
        System.out.println("忽略测试，不会执行");

    }



}
