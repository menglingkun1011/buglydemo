package com.meng.demo.buglydemo;

/**
 * Created by MENG on 2017/3/12.
 */

public class BugClass {

    public static String getStr(){
        String str = null;
        str = "修复了除数为0的bug。。。。";
//
//        int i = 1/0;
//        int length = str.length();
//            int a = 2/0;
        return str;
    }
}
