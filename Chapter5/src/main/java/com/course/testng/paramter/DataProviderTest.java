package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/*
        采用DataProvider时构造参数的方法必须返回Obiect[][]
使用时，首先定义一个DataProvider，通过name参数指定该测试数据的名字；
@DataProvider(name = "data")
    public Object[][] providerData() {}
　　然后在测试方法中，通过Test注解的dataProvider参数指定需要使用的测试数据名字，多个测试方法可用同一个@DataProvider
@Test(dataProvider = "data")
    public void testDataProvider(x x, x x) {}
    这个例子用到了反射，当多个测试方法test1和test2都使用同一个@DataProvider标签时，可以使用java反射，来区分那个测试方法提供哪个数据
method.getName()是反射得到被测试方法名test1，or test2
        * */


public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = "+ name + "age" + age);

    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",15},
                {"wangwu",20},

        };
        return o;
    }

}
