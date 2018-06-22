package com.example.administrator.myapplication.activity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.journeyapps.barcodescanner.CaptureManager;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

import static com.example.administrator.myapplication.R.id;

public class CustomScanActivity extends AppCompatActivity implements DecoratedBarcodeView.TorchListener,View.OnClickListener{ // 实现相关接口
    // 添加一个按钮用来控制闪光灯，同时添加两个按钮表示其他功能，先用Toast表示

    private DecoratedBarcodeView mDBV;
    private CaptureManager captureManager;
    private boolean isLightOn = false;

    @Override
    protected void onPause() {
        super.onPause();
        captureManager.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        captureManager.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        captureManager.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        captureManager.onSaveInstanceState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return mDBV.onKeyDown(keyCode, event) || super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_scan);

        mDBV=(DecoratedBarcodeView)findViewById(id.dbv_custom);
        ImageView swichLight=(ImageView)findViewById(id.btn_switch);
        ImageView sao_back_iv=(ImageView)findViewById(R.id.sao_back_iv);

        sao_back_iv.setOnClickListener(this);
        mDBV.setTorchListener(this);
        swichLight.setOnClickListener(this);
        // 如果没有闪光灯功能，就去掉相关按钮
        if(!hasFlash()) {
            swichLight.setVisibility(View.GONE);
        }

        //重要代码，初始化捕获
        captureManager = new CaptureManager(this,mDBV);
        captureManager.initializeFromIntent(getIntent(),savedInstanceState);
        captureManager.decode();
    }

    // torch 手电筒
    @Override
    public void onTorchOn() {
//        Toast.makeText(this,"torch on",Toast.LENGTH_LONG).show();
        isLightOn = true;
    }

    @Override
    public void onTorchOff() {
//        Toast.makeText(this,"torch off",Toast.LENGTH_LONG).show();
        isLightOn = false;
    }

    // 判断是否有闪光灯功能
    private boolean hasFlash() {
        return getApplicationContext().getPackageManager()
                .hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    }

    // 点击切换闪光灯
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case id.btn_switch:
                if(isLightOn){
                    mDBV.setTorchOff();
                }else{
                    mDBV.setTorchOn();
                }
            break;
            case R.id.sao_back_iv:
                finish();
                break;
        }
    }
}