package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class MyLogIntypeChoose extends AppCompatActivity implements View.OnClickListener {

    private ImageView agricultural_expert_back_iv;
    private TextView tv_choose1;
    private TextView tv_choose2;
    private TextView tv_choose3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_log_intype_choose);
        initView();
        agricultural_expert_back_iv.setOnClickListener(this);
        tv_choose1.setOnClickListener(this);
        tv_choose2.setOnClickListener(this);
        tv_choose3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.agricultural_expert_rice_back_iv:
                finish();
                break;
            case R.id.tv_choose1:
                Intent intent1=getIntent();
                intent1.putExtra("tv1","农情上报");
                setResult(2,intent1);
                finish();
                break;
            case R.id.tv_choose2:
                Intent intent2=getIntent();
                intent2.putExtra("tv2","入户指南");
                setResult(3,intent2);
                finish();
                break;
            case R.id.tv_choose3:
                Intent intent3=getIntent();
                intent3.putExtra("tv3","其他");
                setResult(4,intent3);
                finish();
                break;
        }

    }

    private void initView() {
        agricultural_expert_back_iv = (ImageView) findViewById(R.id.agricultural_expert_back_iv);
        tv_choose1 = (TextView) findViewById(R.id.tv_choose1);
        tv_choose2 = (TextView) findViewById(R.id.tv_choose2);
        tv_choose3 = (TextView) findViewById(R.id.tv_choose3);

    }
}
