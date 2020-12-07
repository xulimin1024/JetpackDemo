package com.example.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lifecycledemo.lifecycle.MyLocationListener;
import com.example.lifecycledemo.lifecycle.MyService;

public class MainActivity extends AppCompatActivity {
    private MyLocationListener myLocationListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建myLocationListener实例对象
        myLocationListener = new MyLocationListener();
        //3.在页面中绑定观察者
        getLifecycle().addObserver(myLocationListener);
        initView();
    }
    private void initView(){
        findViewById(R.id.startService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyService.class);
                startService(intent);
            }
        });

        findViewById(R.id.stopService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyService.class);
                stopService(intent);
            }
        });
    }
}
