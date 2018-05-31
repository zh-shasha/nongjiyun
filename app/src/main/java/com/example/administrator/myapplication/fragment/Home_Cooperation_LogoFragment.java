package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Home_Cooperation_LogoAdapter;
import com.example.administrator.myapplication.moduels.Home_TimeFarmingMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Cooperation_LogoFragment extends Fragment {
    private ListView home_cooperattion_logo_lv;
    private Home_Cooperation_LogoAdapter logoAdapter;
    private List<Home_TimeFarmingMenu> LogoMenu;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_home__cooperation__logo, container, false);
       initView(view);
       init();
        return view;
    }

    private void initView(View view) {
        home_cooperattion_logo_lv=(ListView)view.findViewById(R.id.home_cooperattion_logo_lv);
    }

    private void init() {

        LogoMenu=new ArrayList<>();
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo1,"【关注】农民专业合作社有望享有与其他市场主体平等的法律地位","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo2,"2017“双十品牌”：禧泽牌芦笋","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo1,"2017“双十品牌”：怡膳粮坊牌红豆薏米粉等系列营养粉","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo2,"2017“双十品牌”：大瑭牌鸡蛋","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo1,"2017“双十品牌”：徐穗牌糯米","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo2,"2017“双十品牌”：信峰凰牌孔雀系列产品","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo1,"2017“双十品牌”：吴侬牌茶叶","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo2,"2017“双十品牌”：吴侬牌茶叶","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));
        LogoMenu.add(new Home_TimeFarmingMenu(R.mipmap.hezuo1,"2017“双十品牌”：吴侬牌茶叶","2018-01-12","123", Home_Details.class,"http://www.jsnjy.net.cn/newsDetail.html?newId=b6c897d0-2112-4571-8ebe-3e6299cbc0da"));

        logoAdapter=new Home_Cooperation_LogoAdapter(getActivity(),LogoMenu);
        home_cooperattion_logo_lv.setAdapter(logoAdapter);
        home_cooperattion_logo_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),LogoMenu.get(position).getUrl());
                intent.putExtra("view",LogoMenu.get(position).getNeturl());
                startActivity(intent);
            }
        });
    }

}
