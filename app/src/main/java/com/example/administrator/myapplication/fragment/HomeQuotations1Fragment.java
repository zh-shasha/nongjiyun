package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomeScienceTechnologyDyAdapter;
import com.example.administrator.myapplication.moduels.HomeScienceTechnologyHemu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeQuotations1Fragment extends Fragment {

    private ListView quotations_lv1;
    private List<HomeScienceTechnologyHemu> list;
    private HomeScienceTechnologyDyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view=inflater.inflate(R.layout.fragment_home_quotations1, container, false);
        quotations_lv1=(ListView)view.findViewById(R.id.quotations_lv1);
        initData();
        return view;

    }

    private void initData() {
        list=new ArrayList<>();
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
        list.add(new HomeScienceTechnologyHemu(R.mipmap.icon_circle_red,"早就听说绿壳鸡蛋，但一直不知在哪儿买，没想到在电商找着了","2018-05-30","阅读数：13256", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n"));
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
