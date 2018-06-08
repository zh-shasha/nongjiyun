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
import com.example.administrator.myapplication.adapter.HomeSearchCommAdapter;
import com.example.administrator.myapplication.moduels.Exchange_item;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchAnswerFragment extends Fragment {
    private List<Exchange_item> lists;
    private ListView listView;
    private HomeSearchCommAdapter adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_search_answer, container, false);

        listView = (ListView) view.findViewById(R.id.exchange_lv);
        lists = new ArrayList<>();


        lists.add(new Exchange_item(R.mipmap.icon_default_head, "阿狸","南京","推广人员","zzzzz",R.mipmap.img4,R.mipmap.home_lv_iv2,R.mipmap.img3,"江苏省南京市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment, ExchangeDetail.class));


        adapter = new HomeSearchCommAdapter(getActivity(), lists);
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


