package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;

public class AdvertisingPage extends AppCompatActivity implements Animation.AnimationListener,Runnable {
    Handler handler = new Handler() {//处理者
        @Override
        public void handleMessage(Message msg) {
            TextView textView = (TextView) findViewById(R.id.adtextview);//初始化控件
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(AdvertisingPage.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
            switch (msg.what) {//按时间自动逐秒递减
                case 1:
                    textView.setText("跳过 3s");
                    break;
                case 2:
                    textView.setText("跳过 2s");
                    break;
                case 3:
                    textView.setText("跳过 1s");
                    break;
                case 4:
                    textView.setText("跳过 0s");
                    break;

            }
            super.handleMessage(msg);//发送消息指令
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertising_page);
        setAnimation();
        Thread thread = new Thread(this);
        thread.start();
    }

    private void setAnimation() {//渐变动画
        ImageView imageView = (ImageView) findViewById(R.id.adimageview);
        AlphaAnimation a = new AlphaAnimation(0.8f, 1);
        a.setDuration(3000);//时间
        a.setAnimationListener(this);//配置监听器
        imageView.startAnimation(a);//启动动画

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        //当动画结束的时候跳转
        startActivity(new Intent(AdvertisingPage.this, MainActivity.class));
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void run() {//线程处理倒计时问题
        for (int i = 1; i <= 5; i++) {
            Message message = new Message();
            try {
                Thread.sleep(950);//线程休眠时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            message.what = i;
            handler.sendMessage(message);//发送消息给处理者
        }
    }
}
