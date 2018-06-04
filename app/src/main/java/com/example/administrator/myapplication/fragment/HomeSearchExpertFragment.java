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
import com.example.administrator.myapplication.activity.HomeExpertDetailedInformation;
import com.example.administrator.myapplication.adapter.Home_Agricultural_Provincial_Rice_ExpertAdapter;
import com.example.administrator.myapplication.moduels.Home_Rice_Expert_Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchExpertFragment extends Fragment {

    private List<Home_Rice_Expert_Menu> provincialMenu;
    private ListView provincial_expert_lv;
    private Home_Agricultural_Provincial_Rice_ExpertAdapter adapter;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view= inflater.inflate(R.layout.fragment_home__rice__provincial_expert, container, false);
            provincial_expert_lv=(ListView)view.findViewById(R.id.provincial_expert_lv);
            init();
            return  view;
        }

    private void init() {
        provincialMenu=new ArrayList<>();
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.ic_launcher,"谢成玲","扬州市农业","39","省级专家","水稻", HomeExpertDetailedInformation.class));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",Home_Details.class));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",HomeExpertDetailedInformation.class));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));
        provincialMenu.add(new Home_Rice_Expert_Menu(R.mipmap.icon_default_head,"谢成玲","扬州市农业","39","省级专家","水稻",null));

        adapter=new Home_Agricultural_Provincial_Rice_ExpertAdapter(getActivity(),provincialMenu);
        provincial_expert_lv.setAdapter(adapter);
        provincial_expert_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),provincialMenu.get(position).getUrl());
                startActivity(intent);
            }
        });
    }

}
