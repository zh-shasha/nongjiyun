package com.example.administrator.myapplication.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.myapplication.R;

public class RestPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_pass);
        SharedPreferences sp=getSharedPreferences("admin",MODE_PRIVATE);

    }
}
