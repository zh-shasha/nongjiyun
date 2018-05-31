package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class Home_HeadLine extends AppCompatActivity implements View.OnClickListener{
    private TextView headline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_head_line);
        headline=(TextView)findViewById(R.id.home_headline_tv);

    }

    @Override
    public void onClick(View v) {

    }
}
