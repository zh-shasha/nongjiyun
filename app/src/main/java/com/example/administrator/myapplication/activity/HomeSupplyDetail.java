package com.example.administrator.myapplication.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class HomeSupplyDetail extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_phone;
    private ImageView home_supply_detail_back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_supply_detail);
        tv_phone=(TextView)findViewById(R.id.tv_phone);
        home_supply_detail_back_iv=(ImageView)findViewById(R.id.home_supply_detail_back_iv);
        home_supply_detail_back_iv.setOnClickListener(this);
        tv_phone.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_phone:
                DialogHotline();
                break;
            case R.id.home_supply_detail_back_iv:
                finish();
                break;
        }
    }
    private void DialogHotline() {
        String yes = "<font color='#2EC667'>" + "是" + "</font>";
        String no = "<font color='#2EC667'>" + "否" + "</font>";
        AlertDialog dialog = new AlertDialog.Builder(HomeSupplyDetail.this)
                .setMessage("是否拨打电话")//设置对话框的内容
                //设置对话框的按钮
                .setNegativeButton(Html.fromHtml(no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton(Html.fromHtml(yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        call("025-86261287");
                        dialog.dismiss();
                    }
                }).create();
        dialog.show();
    }
    private void call(String phone) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    }

