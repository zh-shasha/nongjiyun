package com.example.administrator.myapplication.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.Activity_login;
import com.example.administrator.myapplication.utils.MJavascriptInterface;
import com.example.administrator.myapplication.utils.MyWebViewClient;
import com.example.administrator.myapplication.utils.StringUtils;
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
    private ImageView home_detail_back_iv;
    private String[] imageUrls = StringUtils.returnImageUrlsFromHtml();


    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__details);
        webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
     //   webView.loadUrl("http://a.mp.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt&client=ucweb&wm_aid=c51bcf6c1553481885da371a16e33dbe&wm_id=482efebe15ed4922a1f24dc42ab654e6&pagetype=share&btifl=100");
        webView.addJavascriptInterface(new MJavascriptInterface(this,imageUrls), "imagelistener");
        webView.setWebViewClient(new MyWebViewClient());

        MobSDK.init(this);
        details_iv1 = (RadioButton) findViewById(R.id.home_notice_system_collection1);
        details_iv2 = (RadioButton) findViewById(R.id.home_notice_system_share1);

        home_detail_back_iv=(ImageView)findViewById(R.id.home_detail_back_iv);
        details_iv1.setOnClickListener(this);
        details_iv2.setOnClickListener(this);
        home_detail_back_iv.setOnClickListener(this);

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
    protected void onDestroy() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Glide.get(Home_Details.this).clearDiskCache();//清理磁盘缓存需要在子线程中执行
            }
        }).start();
        Glide.get(this).clearMemory();//清理内存缓存可以在UI主线程中进行
        super.onDestroy();
    }
        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.home_detail_back_iv:
                    finish();
                    break;
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