package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.utils.ConfirmPopWindow;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class HomeSessionList extends AppCompatActivity implements View.OnClickListener{
private ImageView home_session_mail_iv;
private ImageView home_session_add_iv;
private ImageView home_session_list_back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_session_list);
        home_session_mail_iv=(ImageView)findViewById(R.id.home_session_mail_iv);
        home_session_add_iv=(ImageView)findViewById(R.id.home_session_add_iv);
        home_session_list_back_iv=(ImageView)findViewById(R.id.home_session_list_back_iv);
        home_session_add_iv.setOnClickListener(this);
        home_session_mail_iv.setOnClickListener(this);
        home_session_list_back_iv.setOnClickListener(this);
        home_session_mail_iv.setOnClickListener(this);
    }
    public void customScan(){
        new IntentIntegrator(this)
                .setOrientationLocked(false)
                .setCaptureActivity(CustomScanActivity.class) // 设置自定义的activity是CustomActivity
                .initiateScan(); // 初始化扫描
    }
    @Override
// 通过 onActivityResult的方法获取 扫描回来的值
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(intentResult != null) {
            if(intentResult.getContents() == null) {
                Toast.makeText(this,"内容为空",Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this,"扫描成功",Toast.LENGTH_LONG).show();
                // ScanResult 为 获取到的字符串
                String ScanResult = intentResult.getContents();
            }
        } else {
            super.onActivityResult(requestCode,resultCode,data);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_session_mail_iv:
                Intent intent = new Intent(HomeSessionList.this, HomeGoodFriendsList.class);
                startActivity(intent);
                break;
            case R.id.home_session_add_iv:
                ConfirmPopWindow dialog=new ConfirmPopWindow(this);
                dialog.showAtBottom(home_session_add_iv);
                break;
            case R.id.home_session_list_back_iv:
                finish();
                break;

        }
    }
    }

