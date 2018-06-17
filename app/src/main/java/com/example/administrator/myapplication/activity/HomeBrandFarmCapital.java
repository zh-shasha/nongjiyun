package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.TabFragmentShouYeAdapter;
import com.example.administrator.myapplication.fragment.HomeBrandFarmCapitalPesticides;
import com.example.administrator.myapplication.fragment.HomeSearchCommunicationFragment;
import com.example.administrator.myapplication.fragment.HomeSearchExpertFragment;
import com.example.administrator.myapplication.fragment.HomeSearchSupplyFragment;
import com.example.administrator.myapplication.fragment.HomeSearchVideoFragment;
import com.example.administrator.myapplication.fragment.HomeSearchinformationFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeBrandFarmCapital extends AppCompatActivity {
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private ImageView home_brand_farm_back_iv;
    private List<String> strings = new ArrayList<String>();;
    private List<Fragment> fragments = new ArrayList<Fragment>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_brand_farm_capital);
        initdate();
        initView();
    }
    private void initView(){
        home_brand_farm_back_iv=(ImageView)findViewById(R.id. home_brand_farm_back_iv);
        home_brand_farm_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tabLayout_shouye = (TabLayout)findViewById(R.id.tablayout_shouye);
        viewPager_shouye = (ViewPager)findViewById(R.id.viewpager_ShouYe);

        viewPager_shouye.setAdapter(new TabFragmentShouYeAdapter(fragments,strings,
                getSupportFragmentManager(),this));
        tabLayout_shouye.setupWithViewPager(viewPager_shouye);
        tabLayout_shouye.setTabTextColors(getResources().getColor(R.color.bar_grey)
                ,getResources().getColor(R.color.green));
    }

    private void initdate(){
        HomeSearchinformationFragment fragment1 = new HomeSearchinformationFragment();
        fragments.add(fragment1);
        strings.add("动态");
        HomeSearchCommunicationFragment fragment2 = new HomeSearchCommunicationFragment();
        fragments.add(fragment2);
        strings.add("专题");
        HomeBrandFarmCapitalPesticides fragment3 = new HomeBrandFarmCapitalPesticides();
        fragments.add(fragment3);
        strings.add("农药");
        HomeSearchExpertFragment fragment4 = new HomeSearchExpertFragment();
        fragments.add(fragment4);
        strings.add("肥料");
        HomeSearchVideoFragment fragment5 = new HomeSearchVideoFragment();
        fragments.add(fragment5);
        strings.add("种子");
        HomeSearchSupplyFragment fragment6 = new HomeSearchSupplyFragment();
        fragments.add(fragment6);
        strings.add("其他");
    }
    }

