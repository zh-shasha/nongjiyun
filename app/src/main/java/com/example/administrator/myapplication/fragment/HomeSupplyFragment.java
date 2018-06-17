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
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply1,"【专家发布】南通小方柿","一、技术要点1.高接树选择,高接树应生长健壮，树相完整，没有严重病虫害，树龄以20年生以下为宜。2.品种选择 ","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",HomeSupplyDetail.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply2,"害虫？益虫？","在原始森林中，植被繁茂，昆虫的种类也较多，但很少见到某一种害虫数量很多，甚至危害猖獗成灾。细细思考我们不难发现，在这样的环境","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply3,"稻田养虾如何出效益?"," 我国稻田养鱼历史悠久，至今至少已有1700多年历史。据史书记载，早在“三国”，后在唐代，在四川、广西一带的稻田已出产鲤鱼、草鱼。","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply4,"【图解】田园综合体","【图解】田园综合体成功的关键要素","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply1,"【专家发布】南通小方柿","一、技术要点1.高接树选择,高接树应生长健壮，树相完整，没有严重病虫害，树龄以20年生以下为宜。2.品种选择 ","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",HomeSupplyDetail.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply2,"害虫？益虫？","在原始森林中，植被繁茂，昆虫的种类也较多，但很少见到某一种害虫数量很多，甚至危害猖獗成灾。细细思考我们不难发现，在这样的环境","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply3,"稻田养虾如何出效益?"," 我国稻田养鱼历史悠久，至今至少已有1700多年历史。据史书记载，早在“三国”，后在唐代，在四川、广西一带的稻田已出产鲤鱼、草鱼。","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.supply4,"【图解】田园综合体","【图解】田园综合体成功的关键要素","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
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
