package com.wn.excelapp.hutool_test;

import cn.hutool.http.HttpUtil;

/**
 * @program: excelapp
 * @description: test a weather api
 * @author: JasonWe
 * @create: 2020-09-09 22:15
 **/
public class WeatherTest {

    public static void main(String args[]){

        // 最简单的HTTP请求，可以自动通过header等信息判断编码，不区分HTTP和HTTPS
        String result1= HttpUtil.get("https://www.apiopen.top/femaleNameApi?page=1");
        System.out.println(result1);
    }



}
