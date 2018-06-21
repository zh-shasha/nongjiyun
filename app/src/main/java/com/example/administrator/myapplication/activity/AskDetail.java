package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.utils.Utils;

public class AskDetail extends AppCompatActivity implements View.OnClickListener,AMapLocationListener {
    private AMapLocationClient locationClient = null;
    private AMapLocationClientOption locationOption = null;
    private TextView textView;
    private String[] strMsg;
    private ImageView imageView_01,imageView_02,imageView_03;
    private ImageView quick_detail_back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_detail);
        initView();
        Location();
        quick_detail_back_iv=findViewById(R.id.quick_detail_back_iv);
        quick_detail_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void Location() {
        // TODO Auto-generated method stub
        try {
            locationClient = new AMapLocationClient(this);
            locationOption = new AMapLocationClientOption();
            // 设置定位模式为低功耗模式
            locationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
            // 设置定位监听
            locationClient.setLocationListener(this);
            locationOption.setOnceLocation(true);//设置为单次定位
            locationClient.setLocationOption(locationOption);// 设置定位参数
            // 启动定位
            locationClient.startLocation();
            mHandler.sendEmptyMessage(Utils.MSG_LOCATION_START);
        } catch (Exception e) {
            Toast.makeText(AskDetail.this, "定位失败", Toast.LENGTH_LONG).show();
        }
    }



    private void initView() {
        imageView_01=(ImageView)findViewById(R.id.photo_1);
        imageView_02=(ImageView)findViewById(R.id.photo_2);
        imageView_03=(ImageView)findViewById(R.id.photo_3);
        textView=findViewById(R.id.exchange_tv_content_address);

        imageView_01.setOnClickListener(this);
        imageView_02.setOnClickListener(this);
        imageView_03.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(AskDetail.this,PhotoViewActivity.class);
        switch (v.getId()){
            case R.id.photo_1:
                intent.putExtra("showphoto",0);
                startActivity(intent);
                break;
            case R.id.photo_2:
                intent.putExtra("showphoto",1);
                startActivity(intent);
                break;
            case R.id.photo_3:
                intent.putExtra("showphoto",2);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onLocationChanged(AMapLocation loc) {
        if (null != loc) {
            Message msg = mHandler.obtainMessage();
            msg.obj = loc;
            msg.what = Utils.MSG_LOCATION_FINISH;
            mHandler.sendMessage(msg);
        }

    }

    Handler mHandler = new Handler() {
        public void dispatchMessage(android.os.Message msg) {
            switch (msg.what) {
                //定位完成
                case Utils.MSG_LOCATION_FINISH:
                    String result = "";
                    try {
                        AMapLocation loc = (AMapLocation) msg.obj;
                        result = Utils.getLocationStr(loc, 1);
                        strMsg = result.split(",");
                        Toast.makeText(AskDetail.this, "定位成功", Toast.LENGTH_LONG).show();
                        textView.setText("地址：" + strMsg[0] + "\n" + "经    度：" + strMsg[1] + "\n" + "纬    度：" + strMsg[1]);
                    } catch (Exception e) {
                        Toast.makeText(AskDetail.this, "定位失败", Toast.LENGTH_LONG).show();
                    }
                    break;
                default:
                    break;
            }
        }

    };
}
