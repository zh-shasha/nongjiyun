package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
public class HomeSearchCommunicationFragment extends Fragment {
    private List<Exchange_item> lists;
    private ListView listView;
    private HomeSearchCommAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_search_communication, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = (ListView) view.findViewById(R.id.exchange_lv);
        lists = new ArrayList<>();
        lists.add(new Exchange_item(R.mipmap.icon_default_head, "赵浩","南京","推广人员","水稻插秧机。。。",R.mipmap.img4,R.mipmap.home_lv_iv2,R.mipmap.img3,"江苏省南京市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment, ExchangeDetail.class));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","看看我的西瓜这是怎么回事",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv2,"安徽省宿州市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","小麦熟了",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv2,"江苏省淮安市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","看看这是怎么回事",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv2,"镇江市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","看看这是怎么回事",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv2,"南通市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));
        adapter = new HomeSearchCommAdapter(getActivity(), lists);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
