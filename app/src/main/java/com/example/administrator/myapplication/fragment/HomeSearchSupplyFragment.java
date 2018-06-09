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
import com.example.administrator.myapplication.adapter.HomeSearchSupplyAdapter;
import com.example.administrator.myapplication.moduels.HomeSearchSupplyMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchSupplyFragment extends Fragment {
    private ListView home_search_supply_lv;
    private List<HomeSearchSupplyMenu> list;
    private HomeSearchSupplyAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_search_supply, container, false);
        home_search_supply_lv=(ListView)view.findViewById(R.id.home_search_supply_lv);
        list=new ArrayList<>();
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        list.add(new HomeSearchSupplyMenu(R.mipmap.home_lv_iv4,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山 13655456963","已过期",R.mipmap.icon_address,"南京工业职业技术学院","2018-06-04",Home_Details.class));
        adapter=new HomeSearchSupplyAdapter(getActivity(),list);
        home_search_supply_lv.setAdapter(adapter);
        home_search_supply_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),list.get(position).getUrl());
                startActivity(intent);
            }
        });
        return view;
    }

}
