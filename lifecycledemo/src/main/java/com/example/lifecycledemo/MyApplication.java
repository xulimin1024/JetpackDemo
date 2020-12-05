package com.example.lifecycledemo;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

import com.example.lifecycledemo.lifecycle.MyApplicationObserver;

//1.新建MyApplication，别忘记注册
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new MyApplicationObserver());
    }
}
