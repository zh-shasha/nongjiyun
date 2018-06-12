package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeDemandPush;
import com.example.administrator.myapplication.adapter.HomeWantToBuyAdapter;
import com.example.administrator.myapplication.moduels.HomeWantToBuyMenu;
import com.example.administrator.myapplication.utils.ListViewForScrollView;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeWantToBuyFragment extends Fragment {
    private ListViewForScrollView home_want_buy_lv;
    private List<HomeWantToBuyMenu> list;
    private HomeWantToBuyAdapter adapter;
    private FloatingActionButton fab_want_fab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_want_to_buy, container, false);
        home_want_buy_lv=(ListViewForScrollView)view.findViewById(R.id.home_want_buy_lv);
        fab_want_fab=(FloatingActionButton)view.findViewById(R.id.fab_want_fab);
        fab_want_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),HomeDemandPush.class);
                startActivity(intent);
            }
        });
        list=new ArrayList<>();
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","   ","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","已过期","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","已过期","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","8/kg","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","已过期 ","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","   ","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","已过期","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","已过期","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","8/kg","2018-06-11"));
        list.add(new HomeWantToBuyMenu("45%复合肥","名牌产品，种植水稻",R.mipmap.icon_address,"江苏省南京市栖霞区","已过期 ","2018-06-11"));

        adapter=new HomeWantToBuyAdapter(getActivity(),list);
        home_want_buy_lv.setAdapter(adapter);
        return view;
    }

}
