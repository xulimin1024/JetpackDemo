package com.example.lifecycledemo.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

//2.创建MyApplicationObserver
public class MyApplicationObserver implements LifecycleObserver {
    private static final String TAG = "MyApplicationObserver";

    //application被创建的时候被调用
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onApplicationCreate(){
        Log.d(TAG,"onApplicationCreate");
    }
    //APP出现在前台被调用
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onApplicationStart(){
        Log.d(TAG,"onApplicationStart");
    }
    //APP出现界面出现
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onApplicationResume(){
        Log.d(TAG,"onApplicationResume");
    }
    //App被挂起的时候被调用
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onApplicationPause(){
        Log.d(TAG,"onApplicationResume");
    }
    //App被挂起,不可见的时候被调用
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onApplicationStop(){
        Log.d(TAG,"onApplicationResume");
    }
    //APP永远不会调用下面的方法
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onApplicationDestory(){
        Log.d(TAG,"onApplicationDestory");
    }

}
