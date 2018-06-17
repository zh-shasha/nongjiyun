package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class MyFillInTheLog extends AppCompatActivity {
    private TextView please_log_tv;
    private ImageView log_back_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fill_in_the_log);
        please_log_tv = (TextView) findViewById(R.id.please_log_tv);
        log_back_bt=(ImageView)findViewById(R.id.log_back_bt);
        log_back_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        please_log_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyFillInTheLog.this, MyLogIntypeChoose.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case 2:
                String kejiao = data.getStringExtra("tv1");
                please_log_tv.setText(kejiao);
                break;
            case 4:
                String newname = data.getStringExtra("tv2");
                please_log_tv.setText(newname);
                break;
            case 6:
                String newcompany = data.getStringExtra("tv3");
                please_log_tv.setText(newcompany);
                break;
        }
    }
}