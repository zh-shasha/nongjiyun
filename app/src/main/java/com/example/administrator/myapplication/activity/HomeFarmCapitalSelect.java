package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;

public class HomeFarmCapitalSelect extends AppCompatActivity implements View.OnClickListener{
    private ImageView home_brand_select_back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_farm_capital_select);
        home_brand_select_back_iv=(ImageView)findViewById(R.id.home_brand_select_back_iv);
        home_brand_select_back_iv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_brand_select_back_iv:
                finish();
                break;
        }

    }
}
