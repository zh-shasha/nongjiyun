package com.example.administrator.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeSearchResultTab;

public class Home_Edit_Search extends AppCompatActivity implements View.OnClickListener{
    private TextView home_search_rice;
    private ImageView edit_search_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__edit__search);
        init();

    }

    private void init() {
        edit_search_back=(ImageView)findViewById(R.id.home_edit_search_back);
        home_search_rice=(TextView)findViewById(R.id.home_search_rice);
        edit_search_back.setOnClickListener(this);
        home_search_rice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_edit_search_back:
                finish();
                break;
            case R.id.home_search_rice:
                Intent intent=new Intent(Home_Edit_Search.this, HomeSearchResultTab.class);
                intent.putExtra("view","稻");
                startActivity(intent);
                finish();
                break;
        }
    }
}
