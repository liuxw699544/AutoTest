package com.course.testng.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class PayTest {
    @Test(enabled = false)
    public void paySuccess(){
        System.out.println("忽略测试，不会执行");

    }



}
