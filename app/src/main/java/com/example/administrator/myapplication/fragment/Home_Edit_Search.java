package com.example.administrator.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeSearchResultTab;

public class Home_Edit_Search extends AppCompatActivity implements View.OnClickListener{
    private TextView home_search_rice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__edit__search);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_search_rice:
                Intent intent=new Intent(Home_Edit_Search.this, HomeSearchResultTab.class);
                startActivity(intent);
        }
    }
}
