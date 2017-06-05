package com.example.wxy.myapplication;

import android.app.Application;

import com.zxy.tiny.Tiny;

/**
 * Created by wxy on 2017/5/20.
 */

public class MyApplicatiomn extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Tiny.getInstance().init(this);
        System.out.println("12");
        System.out.println("34");
        System.out.println("12");
        System.out.println("34");
        System.out.println("12");
        System.out.println("34");
        System.out.println("12");
        System.out.println("34");
    }
}
