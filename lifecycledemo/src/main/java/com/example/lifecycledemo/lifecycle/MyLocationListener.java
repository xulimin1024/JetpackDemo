package com.example.lifecycledemo.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;

//1.写一个类实现LifecycleObserver接口
public class MyLocationListener implements LifecycleObserver {
    private static final String TAG = "MyLocationListener";
    //2.该类中的方法在activity不同的生命周期中调用
    //2.1初始化位置管理
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void initLocationManager(){
        Log.e(TAG,"initLocationManager");
    }
    //2.2在界面显示的时候调用
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void startGetLocation(){
        Log.e(TAG,"startGetLocation");
    }
    //2.3界面被挂起，该方法被释放
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void stopGetLocation(){
        Log.e(TAG,"stopGetLocation");
    }
}
