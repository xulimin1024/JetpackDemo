package com.example.lifecycledemo.lifecycle;

import androidx.lifecycle.LifecycleService;
//2.创建MyService继承自LifecycleService
public class MyService extends LifecycleService {

    private MyServiceObserver myServiceObserver;
    public MyService(){
        //4.创建MyServiceObserver
        myServiceObserver = new MyServiceObserver();
        //5.绑定MyServiceObserver
        getLifecycle().addObserver(myServiceObserver);
    }
}
