package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.AskDetail;
import com.example.administrator.myapplication.activity.QuickQuestionSubmission;
import com.example.administrator.myapplication.adapter.Ask_itemAdapter;
import com.example.administrator.myapplication.moduels.Ask_item;
import com.example.administrator.myapplication.utils.ListViewForScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AskFragment extends Fragment {

    private Button quick_ask_bt;
    private List<Ask_item> lists;
    private ListViewForScrollView listView;
    private Ask_itemAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ask, container, false);
        initView(view);
        init();
        return view;
    }

    private void init() {
        quick_ask_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), QuickQuestionSubmission.class);
                startActivity(intent);
            }
        });

                lists = new ArrayList<>();

                lists.add(new Ask_item(R.mipmap.icon_default_head,"刘强西","江苏省","农技推广","粮经","水稻病害怎么辨别？",R.mipmap.quick3,R.mipmap.quick3,R.mipmap.quick3,"2018-06-05","已回答：2", AskDetail.class));
                lists.add(new Ask_item(R.mipmap.icon_default_head,"马小云","江苏省","农技推广","粮经","这种病害怎么办？",R.mipmap.ex8,R.mipmap.ex8,R.mipmap.ex8,"2018-06-05","已回答：2",AskDetail.class));
                lists.add(new Ask_item(R.mipmap.icon_default_head,"王健林","江苏省","农技推广","粮经","青蒜/薹蒜、玉米复合高效种植模式",R.mipmap.quick1,R.mipmap.quick1,R.mipmap.quick1,"2018-06-05","已回答：2",null));
                lists.add(new Ask_item(R.mipmap.icon_default_head,"王子峰","江苏省","农技推广","粮经","农村没有房地产市场？你错了，它一直都在……",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv3,"2018-06-05","已回答：2",null));

                lists.add(new Ask_item(R.mipmap.icon_default_head,"刘强西","江苏省","农技推广","粮经","水稻病害怎么辨别？",R.mipmap.quick3,R.mipmap.quick3,R.mipmap.quick3,"2018-06-05","已回答：2", AskDetail.class));
                lists.add(new Ask_item(R.mipmap.icon_default_head,"马小云","江苏省","农技推广","粮经","这种病害怎么办？",R.mipmap.ex8,R.mipmap.ex8,R.mipmap.ex8,"2018-06-05","已回答：2",AskDetail.class));
                lists.add(new Ask_item(R.mipmap.icon_default_head,"王健林","江苏省","农技推广","粮经","青蒜/薹蒜、玉米复合高效种植模式",R.mipmap.quick1,R.mipmap.quick1,R.mipmap.quick1,"2018-06-05","已回答：2",null));
                lists.add(new Ask_item(R.mipmap.icon_default_head,"王子峰","江苏省","农技推广","粮经","农村没有房地产市场？你错了，它一直都在……",R.mipmap.home_lv_iv1,R.mipmap.home_lv_iv2,R.mipmap.home_lv_iv3,"2018-06-05","已回答：2",null));


                adapter = new Ask_itemAdapter(getActivity(),lists);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(getActivity(), lists.get(position).getaClass());
                        startActivity(intent);
                    }
        });
    }

    private void initView(View view) {

        quick_ask_bt=(Button)view.findViewById(R.id.quick_ask_bt);
        listView = (ListViewForScrollView)view.findViewById(R.id.quick_question_lv);
    }

}
