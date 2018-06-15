package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Home_Expert_SuggestionAdapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.Home_TimeFarmingMenu;

import java.util.ArrayList;
import java.util.List;

public class Home_Agricultural_Expert_New extends AppCompatActivity {
    private ListView home_expert_new_lv;
    private List<Home_TimeFarmingMenu> expert_suggestion;
    private Home_Expert_SuggestionAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__agricultural__expert__new);
        init();
    }

    private void init() {
        home_expert_new_lv=(ListView)findViewById(R.id.home_expert_new_lv);
        expert_suggestion=new ArrayList<>();
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数:123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数:123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        expert_suggestion.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));

        adapter=new Home_Expert_SuggestionAdapter(this,expert_suggestion);
        home_expert_new_lv.setAdapter(adapter);

        home_expert_new_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Home_Agricultural_Expert_New.this,expert_suggestion.get(position).getUrl());
                intent.putExtra("view",expert_suggestion.get(position).getNeturl());
                startActivity(intent);
            }
        });
            }
}
