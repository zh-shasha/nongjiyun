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
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
        LogoMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1," ","专家发布",Home_Details.class,null));
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
