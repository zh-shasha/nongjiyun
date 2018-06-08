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
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.ExchangeDetail;
import com.example.administrator.myapplication.activity.ExchangePush;
import com.example.administrator.myapplication.adapter.Exchange_itemAdapter;
import com.example.administrator.myapplication.moduels.Exchange_item;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExchangeFragment extends Fragment {
    private List<Exchange_item> lists;
    private ListView listView;
    private Exchange_itemAdapter adapter;
    private TextView push;

    public ExchangeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_exchange, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        push =(TextView)view.findViewById(R.id.exchange_tv_push);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),ExchangePush.class);
                startActivity(intent);
            }
        });




        listView = (ListView) view.findViewById(R.id.exchange_lv);
        lists = new ArrayList<>();

        lists.add(new Exchange_item(R.mipmap.icon_default_head, "阿狸","南京","推广人员","看看",R.mipmap.img4,R.mipmap.home_lv_iv2,R.mipmap.img3,"江苏省南京市","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment, ExchangeDetail.class));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","看看这是怎么回事",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv3,"江苏省南京市栖霞区仙林大学城","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","看看这是怎么回事",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv3,"江苏省南京市栖霞区仙林大学城","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));
        lists.add(new Exchange_item(R.mipmap.icon_default_head,"赵志远","南京市栖霞区","普通用户","看看这是怎么回事",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv3,"江苏省南京市栖霞区仙林大学城","2018-06-12",R.mipmap.icon_good,R.mipmap.icon_comment,null));



        adapter = new Exchange_itemAdapter(getActivity(), lists);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), lists.get(position).getaClass());
                startActivity(intent);
            }
        });
    }


}
