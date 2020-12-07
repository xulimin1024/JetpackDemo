package com.example.lifecycledemo.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

//3.新建MyServiceObserver继承自LifecycleObserver
public class MyServiceObserver implements LifecycleObserver {
    private static final String TAG = "MyServiceObserver";
    //3.在MyServiceObserver类中实现业务逻辑，并绑定生命周期
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void getServiceStart(){
        Log.d(TAG,"getServiceStart");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void getServiceStop(){
        Log.d(TAG,"getServiceStop");
    }
}
