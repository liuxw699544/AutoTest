package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*
 * 这个是使用xml参数化
 * 创建一个ParamterTest类，加上要传递的参数name age ，然后创建Paramter.xml
 * 在xml文件中去放入要传递的参数
 * */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = "+ name + "age" + age);


    }

}
