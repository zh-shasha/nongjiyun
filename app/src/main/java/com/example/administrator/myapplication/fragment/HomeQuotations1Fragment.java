package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomeScienceTechnologyDyAdapter;
import com.example.administrator.myapplication.moduels.HomeScienceTechnologyHemu;
import com.example.administrator.myapplication.utils.ListViewForScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeQuotations1Fragment extends Fragment {

    private ListViewForScrollView quotations_lv1;
    private List<HomeScienceTechnologyHemu> list;
    private HomeScienceTechnologyDyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view=inflater.inflate(R.layout.fragment_home_quotations1, container, false);
        quotations_lv1=(ListViewForScrollView)view.findViewById(R.id.quotations_lv1);
        initData();
        return view;

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
        adapter=new HomeScienceTechnologyDyAdapter(getActivity(),list);
        quotations_lv1.setAdapter(adapter);
        quotations_lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),list.get(position).getUrl());
                intent.putExtra("view",list.get(position).getNeturl());
                startActivity(intent);
            }
        });
    }

}
