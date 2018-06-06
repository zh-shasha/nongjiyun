package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class MyExtensionLog extends AppCompatActivity implements View.OnClickListener {
    private ImageView log_back_bt;
    private TextView log_push_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_extension_log);
         log_back_bt=(ImageView)findViewById(R.id.log_back_bt);
        log_push_tv=(TextView) findViewById(R.id.log_push_tv);
        log_back_bt.setOnClickListener(this);
        log_push_tv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.log_back_bt:
                finish();
                break;
            case R.id.log_push_tv:
                Intent intent=new Intent(MyExtensionLog.this,MyFillInTheLog.class);
                startActivity(intent);
                break;
        }
    }
}
