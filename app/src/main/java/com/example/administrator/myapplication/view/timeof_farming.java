package com.example.administrator.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Home_Gridview_Timeof_Farming_Adapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.Home_TimeFarmingMenu;

import java.util.ArrayList;
import java.util.List;

public class timeof_farming extends AppCompatActivity {
    private List<Home_TimeFarmingMenu> timeofFarming;
    private ListView farming_lv;
    private Home_Gridview_Timeof_Farming_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeof_farming);
     ImageView time_back_iv=findViewById(R.id.time_back_iv);
     time_back_iv.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             finish();
         }
     });
        farming_lv=(ListView)findViewById(R.id.home_time_of_farming_lv);
        init();
        farming_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(timeof_farming.this,timeofFarming.get(position).getUrl());
                intent.putExtra("view",timeofFarming.get(position).getNeturl());
                startActivity(intent);
            }
        });

    }

    private void init() {
        timeofFarming=new ArrayList<>();
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.nongshi1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.nongshi1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.nongshi1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.nongshi1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        timeofFarming.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        adapter=new Home_Gridview_Timeof_Farming_Adapter(timeof_farming.this,timeofFarming);
        farming_lv.setAdapter(adapter);
    }
}
