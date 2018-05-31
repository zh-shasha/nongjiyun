package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.myapplication.R;

import java.util.Timer;
import java.util.TimerTask;

public class Boot_page extends AppCompatActivity {
    //定义定时器，定义定时器任务
    private final Timer timer=new Timer();
    private TimerTask task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   this.requestWindowFeature(Window.FEATURE_NO_TITLE);
          setContentView(R.layout.activity_boot_page);
//        if (getSupportActionBar() != null){
//            getSupportActionBar().hide();
//        }
        //初始化定时器任务
          task=new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(Boot_page.this, AdvertisingPage.class);
                startActivity(intent);
                //finish();
            }
        };
        //启动定时器
        timer.schedule(task,1500);
    }

}
