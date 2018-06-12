package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeSupplyDetail;
import com.example.administrator.myapplication.activity.HomeSupplyPush;
import com.example.administrator.myapplication.adapter.HomeSearchSupplyAdapter;
import com.example.administrator.myapplication.moduels.HomeSearchSupplyMenu;
import com.example.administrator.myapplication.utils.ListViewForScrollView;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSupplyFragment extends Fragment {
    private ListViewForScrollView home_supply_lv;
    private List<HomeSearchSupplyMenu> list;
    private HomeSearchSupplyAdapter adapter;
    private FloatingActionButton fab_add_comment;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_supply, container, false);
        home_supply_lv=(ListViewForScrollView) view.findViewById(R.id.home_supply_lv);
        fab_add_comment=(FloatingActionButton)view.findViewById(R.id.fab_add_comment);
         fab_add_comment.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getActivity(),HomeSupplyPush.class);
                 startActivity(intent);
             }
         });
        list=new ArrayList<>();
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv1,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",HomeSupplyDetail.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv2,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv3,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv1,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.ic_launcher,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.ic_launcher,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.ic_launcher,"标题","内容","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        adapter=new HomeSearchSupplyAdapter(getActivity(),list);
        home_supply_lv.setAdapter(adapter);
        home_supply_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),list.get(position).getUrl());
                startActivity(intent);
            }
        });
        return view;
    }

}
