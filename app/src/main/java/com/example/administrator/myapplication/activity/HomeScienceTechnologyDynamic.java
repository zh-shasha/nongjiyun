package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomeScienceTechnologyDyAdapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.HomeScienceTechnologyHemu;
import com.example.administrator.myapplication.utils.ListViewForScrollView;

import java.util.ArrayList;
import java.util.List;

public class HomeScienceTechnologyDynamic extends AppCompatActivity {
    private ListViewForScrollView listview;
    private List<HomeScienceTechnologyHemu> list;
    private HomeScienceTechnologyDyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_science_technology_dynamic);

        init();
        initData();
    }



    private void init() {
        listview=(ListViewForScrollView)findViewById(R.id.home_science_technology_dynamic_lv);

    }
    private void initData() {
        list=new ArrayList<>();
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋","2018-05-30","阅读数：13256", Home_Details.class,"https://view.inews.qq.com/q/WXN20180602000567061?refer=mobileqq&rg=3&_wv=1&_rp=1&cur_pos=3&bkt=11002&qq=1968844105&rs=0&pid=2018060214&gid=0&tbkt=F"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://www.agronet.com.cn/News/1219221.html"));
        adapter=new HomeScienceTechnologyDyAdapter(this,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(HomeScienceTechnologyDynamic.this,list.get(position).getUrl());
                intent.putExtra("view",list.get(position).getNeturl());
                startActivity(intent);
            }
        });
    }
    }

