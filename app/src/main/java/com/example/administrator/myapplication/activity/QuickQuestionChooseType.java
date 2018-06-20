package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class QuickQuestionChooseType extends AppCompatActivity implements View.OnClickListener {

    private ImageView agricultural_expert_back_iv;
    private TextView tv_liangjing;
    private TextView tv_yuanyi;
    private TextView tv_chumu;
    private TextView tv_shuichan;
    private TextView tv_nongji;
    private TextView tv_qita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_question_choose_type);
        initView();
    }

    private void initView() {
        agricultural_expert_back_iv = (ImageView) findViewById(R.id.agricultural_expert_back_iv);
        tv_liangjing = (TextView) findViewById(R.id.tv_liangjing);
        tv_yuanyi = (TextView) findViewById(R.id.tv_yuanyi);
        tv_chumu = (TextView) findViewById(R.id.tv_chumu);
        tv_shuichan = (TextView) findViewById(R.id.tv_shuichan);
        tv_nongji = (TextView) findViewById(R.id.tv_nongji);
        tv_qita = (TextView) findViewById(R.id.tv_qita);
        tv_liangjing.setOnClickListener(this);
        tv_yuanyi.setOnClickListener(this);
        tv_chumu.setOnClickListener(this);
        tv_shuichan.setOnClickListener(this);
        tv_nongji.setOnClickListener(this);
        tv_qita.setOnClickListener(this);
        agricultural_expert_back_iv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.agricultural_expert_back_iv:
                finish();
                break;
            case R.id.tv_liangjing:
                Intent intent=getIntent();
                intent.putExtra("liangjing","粮经");
                setResult(100,intent);
                finish();
                break;
            case R.id.tv_yuanyi:
                intent = getIntent();
                intent.putExtra("yuanyi","园艺");
                setResult(200,intent);
                finish();
                break;
            case R.id.tv_chumu:
                intent = getIntent();
                intent.putExtra("chumu","畜牧");
                setResult(300,intent);
                finish();
                break;
            case R.id.tv_shuichan:
                intent = getIntent();
                intent.putExtra("shuichan","水产");
                setResult(400,intent);
                finish();
                break;
            case R.id.tv_nongji:
                intent = getIntent();
                intent.putExtra("nongji","农机");
                setResult(500,intent);
                finish();
                break;
            case R.id.tv_qita:
                intent = getIntent();
                intent.putExtra("qita","其他");
                setResult(600,intent);
                finish();
                break;
        }
    }
}
