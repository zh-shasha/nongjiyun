package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;

public class HomeAddFriendsDetail extends AppCompatActivity {
    private ImageView home_add_detail_back_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_add_friends_detail);
        home_add_detail_back_iv=(ImageView)findViewById(R.id.home_add_detail_back_iv);
        home_add_detail_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
