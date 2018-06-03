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
import com.example.administrator.myapplication.adapter.HomeSearchInformationAdapter;
import com.example.administrator.myapplication.moduels.HomeNewMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchinformationFragment extends Fragment {

    private List<HomeNewMenu> list;
    private ListView lv_search_information;
    private HomeSearchInformationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_searchinformation, container, false);
        lv_search_information= (ListView) view.findViewById(R.id.lv_search_information);
        list=new ArrayList<>();
        HomeNewMenu news1 = new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class);
        HomeNewMenu news2 = new HomeNewMenu(R.mipmap.home_lv_iv2, "集成推广水稻绿色水稻高品质高效技术模式", "2018-04-19", "阅读数：17人",Home_Details.class);
        HomeNewMenu news3 = new HomeNewMenu(R.mipmap.home_lv_iv3, "集成推广水稻绿色水稻高品质高效技术模式", "2018-06-14", "阅读数：217人",Home_Details.class);
        HomeNewMenu news4 = new HomeNewMenu(R.mipmap.home_lv_iv3, "集成推广水稻绿色水稻高品质高效技术模式", "2018-05-22", "阅读数：517人",Home_Details.class);
        HomeNewMenu news5 = new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class);
        HomeNewMenu news6 = new HomeNewMenu(R.mipmap.home_lv_iv2, "集成推广水稻绿色水稻高品质高效技术模式", "2018-04-19", "阅读数：17人",Home_Details.class);
        HomeNewMenu news7 = new HomeNewMenu(R.mipmap.home_lv_iv3, "集成推广水稻绿色水稻高品质高效技术模式", "2018-06-14", "阅读数：217人",Home_Details.class);
        HomeNewMenu news8 = new HomeNewMenu(R.mipmap.home_lv_iv3, "集成推广水稻绿色水稻高品质高效技术模式", "2018-05-22", "阅读数：517人",Home_Details.class);
        list.add(news1);
        list.add(news2);
        list.add(news3);
        list.add(news4);
        list.add(news5);
        list.add(news6);
        list.add(news7);
        list.add(news8);
        adapter= new HomeSearchInformationAdapter(getActivity(),list);
        lv_search_information.setAdapter(adapter);
        lv_search_information.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),list.get(position).getUrl());
                startActivity(intent);
            }
        });
        return  view;
    }

}
