package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeFarmCapitalSelect;
import com.example.administrator.myapplication.activity.HomeFarmCompanySelect;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeBrandFarmCapitalPesticides extends Fragment {

    private ImageView image_nongyao;
    private ImageView home_brand_company_select1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_brand_pesticides, container, false);
        initView(view);
        init();
        return view;
    }

    private void init() {
        image_nongyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), HomeFarmCapitalSelect.class);
                startActivity(intent);
            }
        });
        home_brand_company_select1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), HomeFarmCompanySelect.class);
                startActivity(intent);
            }
        });

    }
    private void initView(View view) {
        image_nongyao=(ImageView)view.findViewById(R.id.image_nongyao);
        home_brand_company_select1=(ImageView)view.findViewById(R.id.home_brand_company_select1);

    }

}
