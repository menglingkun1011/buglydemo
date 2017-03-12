package com.meng.demo.buglydemo;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by MENG on 2017/3/12.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "141ab0cd21", false);
    }
}
