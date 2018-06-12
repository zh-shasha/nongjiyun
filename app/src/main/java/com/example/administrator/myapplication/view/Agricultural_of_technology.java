package com.example.administrator.myapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.administrator.myapplication.adapter.HomeTechnologyGridviewAdapter;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.Home_technology_gridview;

import java.util.ArrayList;
import java.util.List;

public class Agricultural_of_technology extends AppCompatActivity {
    private GridView gridview;
    private List<Home_technology_gridview> home_technology_gridviewList;
    private HomeTechnologyGridviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_agricultural_of_technology);
//        if (getSupportActionBar()!=null){
//            getSupportActionBar().hide();
//        }
        gridview=(GridView)findViewById(R.id.home_agricultural_of_technology_gridview);

        home_technology_gridviewList=new ArrayList<>();
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.rice,"水稻",Home_technology_gridview_rice.class));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.wheat,"小麦",Home_technology_gridview_Wheat.class));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.tejing_technology,"特粮特精",Home_technology_gridview_Specialdiet.class));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.shucai_technology,"蔬菜",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.guoshu,"果树",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.zhibao,"植保",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.shengzhu_technology,"生猪",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.jiaqin,"家禽",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.jiachu,"家畜",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.huanjingnengyuan,"环境能源",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.nongji,"农机装备",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.shuichan,"水产",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.chaye_technology,"茶叶",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.huamu,"花木",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.sangcan,"蚕桑",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.nongchanpinjiagong,"加工制备",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.nongchanpinzhiliang,"农产品质量",null));
        home_technology_gridviewList.add(new Home_technology_gridview(R.mipmap.nongyexinxihua,"农业信息化",null));

        adapter=new HomeTechnologyGridviewAdapter(this,home_technology_gridviewList);
        gridview.setAdapter(adapter);
    }
}
