package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.ExchangeDetail;
import com.example.administrator.myapplication.adapter.HomeSearchAnswerAdapter;
import com.example.administrator.myapplication.moduels.HomeSearchTabAnswerMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchAnswerFragment extends Fragment {
    private List<HomeSearchTabAnswerMenu> lists;
    private ListView listView;
    private HomeSearchAnswerAdapter adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_search_answer, container, false);

        listView = (ListView) view.findViewById(R.id.exchange_lv);
        lists = new ArrayList<>();


        lists.add(new HomeSearchTabAnswerMenu(R.mipmap.icon_default_head, "王尧","南京市 市辖","粮经","南梗46和南梗稻5055插秧需要多少基本苗和基本肥？",R.mipmap.ex8,R.mipmap.ex8,R.mipmap.ex8,"江苏省南京市","2018-06-12","家庭农场","已回答：3", ExchangeDetail.class));


        adapter = new HomeSearchAnswerAdapter(getActivity(), lists);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    }


