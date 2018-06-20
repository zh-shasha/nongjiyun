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
import com.example.administrator.myapplication.adapter.Home_Library_Adapter;
import com.example.administrator.myapplication.moduels.Home_TimeFarmingMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Directory_Library_Fragment extends Fragment {

    private ListView library_lv;
    private  List<Home_TimeFarmingMenu> LibraryMenu;
    private Home_Library_Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_home__directory__library_, container, false);
        initView(view);
        init();
        return view;

    }

    private void initView(View view) {
        library_lv=(ListView)view.findViewById(R.id.home_directory_library_lv);
    }

    private void init() {

        LibraryMenu=new ArrayList<>();
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        LibraryMenu.add(new Home_TimeFarmingMenu("联合品牌","2018-06-06","阅读数：123",R.mipmap.home_lv_iv1,"置顶","专家发布",Home_Details.class,null));
        adapter=new Home_Library_Adapter(getActivity(),LibraryMenu);
        library_lv.setAdapter(adapter);

        library_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),LibraryMenu.get(position).getUrl());
                startActivity(intent);

            }
        });
    }

}
