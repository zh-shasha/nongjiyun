package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;

public class HomeSessionList extends AppCompatActivity implements View.OnClickListener{
private ImageView home_session_mail_iv;
private ImageView home_session_add_iv;
private ImageView home_session_list_back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_session_list);
        home_session_mail_iv=(ImageView)findViewById(R.id.home_session_mail_iv);
        home_session_add_iv=(ImageView)findViewById(R.id.home_session_add_iv);
        home_session_list_back_iv=(ImageView)findViewById(R.id.home_session_list_back_iv);
        home_session_add_iv.setOnClickListener(this);
        home_session_mail_iv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_session_mail_iv:
                Intent intent=new Intent(HomeSessionList.this,HomeGoodFriendsList.class);
                startActivity(intent);
                break;
            case R.id.home_session_add_iv:
                Intent intent1=new Intent(HomeSessionList.this,HomeAddFriendsList.class);
                startActivity(intent1);
                break;
            case R.id.home_session_list_back_iv:
                finish();
                break;

        }

    }
}
