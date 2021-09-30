package com.course.httpclient.cookies;

import netscape.javascript.JSObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForPost {
    private String url;
    private ResourceBundle bundle;
    //用来存储cookies信息的变量
    private CookieStore store;

    @BeforeTest
    public void BeforceTest(){
        //ResourceBundle对象默认读取application.propreties
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");

    }

    @Test
    public void  testGetCookies() throws IOException {
        String result;
        //从propreties配置文件拼接URL
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url+uri;

        //测试逻辑代码编写
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);

        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookiesList = store.getCookies();

        for (Cookie cookie : cookiesList){
            String name = cookie.getName();
            String value = cookie.getValue();

            System.out.println("cookies name = "+name
                    +";cookies value ="+value);

        }

    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public  void testPostMethod(){
        String uri = bundle.getString("test.post.with.cookies");
        //拼接最终的测试地址
        String testUrl = this.url+uri;

        //声明一个client对象，用于方法执行
        DefaultHttpClient client = new DefaultHttpClient();

        //声明一个方法，这个方法就是post方法
        HttpPost post = new HttpPost();

        //添加参数
        JSON
        //设置请求头信息

        //声明对象进行相应结果的存储

        //


    }

}
