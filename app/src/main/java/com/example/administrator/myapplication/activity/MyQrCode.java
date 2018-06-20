package com.example.administrator.myapplication.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.utils.ZXingUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyQrCode extends AppCompatActivity {
        private ImageView qr_back_bt;
        private ImageView iv_qr_code;//显示二维码的ImageView
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my_qr_code);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");// HH:mm:ss
//获取当前时间
            qr_back_bt=(ImageView)findViewById(R.id.qr_back_bt);
            iv_qr_code= (ImageView) findViewById(R.id.iv_qr_code);
            Date date = new Date(System.currentTimeMillis());
            String content="移动1611-周沙沙"+simpleDateFormat.format(date);
            Bitmap bitmap = ZXingUtils.createQRImage(content, 300, 300);
            iv_qr_code.setImageBitmap(bitmap);

            qr_back_bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
}


