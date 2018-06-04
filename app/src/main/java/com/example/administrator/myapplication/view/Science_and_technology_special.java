package com.example.administrator.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeScienceTechnologyDynamic;
import com.example.administrator.myapplication.adapter.HomeScienceTechnologyItemAdapter;
import com.example.administrator.myapplication.adapter.ScienceTechnologyAdapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.HomeScienceTechnologyHemu;
import com.example.administrator.myapplication.moduels.HomeScienceTechnologyItemHenu;
import com.example.administrator.myapplication.utils.ListViewForScrollView;

import java.util.ArrayList;
import java.util.List;

public class Science_and_technology_special extends AppCompatActivity {
    private ScienceTechnologyAdapter adapter;
    private List<HomeScienceTechnologyHemu> list;
    private ListViewForScrollView science_technology_lv;
    private ListViewForScrollView science_technology_pic_lv;
    private TextView home_science_technology_more;
    private List<HomeScienceTechnologyItemHenu> piclist;
    private HomeScienceTechnologyItemAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_and_technology_special);
        init();
        initData();
    }



    private void init() {
        science_technology_lv=(ListViewForScrollView)findViewById(R.id.science_technology_lv);
        home_science_technology_more=(TextView)findViewById(R.id.home_science_technology_more);
        science_technology_pic_lv=(ListViewForScrollView)findViewById(R.id.science_technology_pic_lv);


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
        adapter=new ScienceTechnologyAdapter(this,list);
        science_technology_lv.setAdapter(adapter);
        science_technology_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent=new Intent(Science_and_technology_special.this,list.get(position).getUrl());
                intent.putExtra("view",list.get(position).getNeturl());
                startActivity(intent);
                home_science_technology_more.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(Science_and_technology_special.this, HomeScienceTechnologyDynamic.class);
                        startActivity(intent1);
                    }
                });
            }
        });

        piclist=new ArrayList<>();
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));
        piclist.add(new HomeScienceTechnologyItemHenu(R.mipmap.ic_launcher,Home_Details.class));

        adapter2=new HomeScienceTechnologyItemAdapter(this,piclist);
        science_technology_pic_lv.setAdapter(adapter2);
        science_technology_pic_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Science_and_technology_special.this,piclist.get(position).getClass());
                startActivity(intent);
            }
        });

    }
}
