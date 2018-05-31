package com.example.administrator.myapplication.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RadioButton;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.Activity_login;
import com.mob.MobSDK;

import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class Home_Details extends AppCompatActivity implements View.OnClickListener{
    private RadioButton details_iv1;
    private RadioButton details_iv2;
    private WebView webView;
    private WebSettings webSettings;

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__details);
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//
//
//
//// User settings
//
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
//        webSettings.setUseWideViewPort(true);//关键点
//
//        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//
//        webSettings.setDisplayZoomControls(false);
//        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
//        webSettings.setAllowFileAccess(true); // 允许访问文件
//        webSettings.setBuiltInZoomControls(true); // 设置显示缩放按钮
//        webSettings.setSupportZoom(true); // 支持缩放
//        webSettings.setLoadWithOverviewMode(true);
//
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        int mDensity = metrics.densityDpi;
//        Log.d("maomao", "densityDpi = " + mDensity);
//        if (mDensity == 240) {
//            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
//        } else if (mDensity == 160) {
//            webSettings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
//        } else if(mDensity == 120) {
//            webSettings.setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
//        }else if(mDensity == DisplayMetrics.DENSITY_XHIGH){
//            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
//        }else if (mDensity == DisplayMetrics.DENSITY_TV){
//            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
//        }else{
//            webSettings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
//        }
//
//
///**
// * 用WebView显示图片，可使用这个参数 设置网页布局类型： 1、LayoutAlgorithm.NARROW_COLUMNS ：
// * 适应内容大小 2、LayoutAlgorithm.SINGLE_COLUMN:适应屏幕，内容将自动缩放
// */
//        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

        MobSDK.init(this);
        details_iv1 = (RadioButton) findViewById(R.id.home_notice_system_collection1);
        details_iv2 = (RadioButton) findViewById(R.id.home_notice_system_share1);
        webView=(WebView)findViewById(R.id.webView);
        details_iv1.setOnClickListener(this);
        details_iv2.setOnClickListener(this);


        //取得从上一个Activity当中传递过来的Intent对象
        Intent intent = getIntent();
        //从Intent当中根据key取得value
        String value = intent.getStringExtra("view");
        //根据控件的ID得到响应的控件对象
         webView.loadUrl(value);






        /**
         * 微信分享给好友 点击事件
         */
    }
        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.home_notice_system_collection1:
                    Intent intent = new Intent(Home_Details.this, Activity_login.class);
                    startActivity(intent);
                    break;
                case R.id.home_notice_system_share1:

                    OnekeyShare oks = new OnekeyShare();
                    oks.setImageUrl("");
                    oks.setText("text");
                    oks.setTitle("title");
                    oks.setCallback(new PlatformActionListener() {
                        @Override
                        public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                            Log.i("ssss", "onComplete");
                        }

                        @Override
                        public void onError(Platform platform, int i, Throwable throwable) {
                            Log.i("ssss", "onError" + throwable);
                        }

                        @Override
                        public void onCancel(Platform platform, int i) {
                            Log.i("ssss", "onCancel");
                        }
                    });
                    oks.show(Home_Details.this);
                    break;
            }
        }

    }