package com.example.administrator.myapplication.activity;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.utils.LocationUtil;

import java.io.IOException;

public class QuickQuestionSubmission extends AppCompatActivity {
    private RadioButton quick_question_photo_rb;
    private RadioButton quick_question_video_rb;
    private ImageView agricultural_expert_back_iv;
    private TextView tv_receive;
    private LinearLayout ly_question_choose;
    private String str_location;
    private TextView push_address;
    private static final int REQUEST_PERMISSION_LOCATION = 255;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_quick_question_submission);
        initView();
        initOnclick();


        push_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                issuelocation();
            }
//

        });
//
//
    }

    private void issuelocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission
                (this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION}, 1);}
        else {
            LocationUtil.initLocation(this);
            System.out.println("22222");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        str_location= LocationUtil.getAddress(LocationUtil.location,getApplicationContext());
                        //位置信息-----一个字符串
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                System.out.println("3333");
                                push_address.setText(str_location);
                            }
                        });


                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case 100:
                String liangjing=data.getStringExtra("liangjing");
                tv_receive.setText(liangjing);
                break;
            case 200:
                String yuanyi=data.getStringExtra("yuanyi");
                tv_receive.setText(yuanyi);
                break;
            case 300:
                String chumu=data.getStringExtra("chumu");
                tv_receive.setText(chumu);
                break;
            case 400:
                String shuichan=data.getStringExtra("shuichan");
                tv_receive.setText(shuichan);
                break;
            case 500:
                String nongji=data.getStringExtra("nongji");
                tv_receive.setText(nongji);
                break;
            case 600:
                String qita=data.getStringExtra("qita");
                tv_receive.setText(qita);
                break;

        }
    }

    private void initView() {
        agricultural_expert_back_iv = (ImageView) findViewById(R.id.agricultural_expert_back_iv);
        tv_receive = (TextView) findViewById(R.id.tv_receive);
        ly_question_choose = (LinearLayout) findViewById(R.id.ly_question_choose);
        quick_question_photo_rb=(RadioButton)findViewById(R.id.quick_question_photo_rb);
        quick_question_video_rb=(RadioButton)findViewById(R.id.quick_question_video_rb);
        push_address = (TextView)findViewById(R.id.push_address);
    }
    private void initOnclick() {
        ly_question_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuickQuestionSubmission.this,QuickQuestionChooseType.class);
                startActivityForResult(intent,1);
            }
        });
        quick_question_video_rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuickQuestionSubmission.this,QuickQuestionRecordVideo.class);
                startActivity(intent);
            }
        });

        agricultural_expert_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
        }

