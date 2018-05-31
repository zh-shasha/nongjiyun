package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.TabFragmentShouYeAdapter;
import com.example.administrator.myapplication.fragment.HomeSearchAnswerFragment;
import com.example.administrator.myapplication.fragment.HomeSearchCommunicationFragment;
import com.example.administrator.myapplication.fragment.HomeSearchExpertFragment;
import com.example.administrator.myapplication.fragment.HomeSearchSupplyFragment;
import com.example.administrator.myapplication.fragment.HomeSearchVideoFragment;
import com.example.administrator.myapplication.fragment.HomeSearchinformationFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeSearchResultTab extends FragmentActivity {
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private List<String> strings = new ArrayList<String>();;
    private List<Fragment> fragments = new ArrayList<Fragment>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_search_result_tab);
        initdate();
        initView();
    }
    private void initView(){
        tabLayout_shouye = (TabLayout)findViewById(R.id.tablayout_shouye);
        viewPager_shouye = (ViewPager)findViewById(R.id.viewpager_ShouYe);
        viewPager_shouye.setAdapter(new TabFragmentShouYeAdapter(fragments,strings,
                getSupportFragmentManager(),this));
        tabLayout_shouye.setupWithViewPager(viewPager_shouye);
        tabLayout_shouye.setTabTextColors(getResources().getColor(R.color.green)
                ,getResources().getColor(R.color.bar_grey));
    }

    private void initdate(){
        HomeSearchinformationFragment fragment1 = new HomeSearchinformationFragment();
        fragments.add(fragment1);
        strings.add("资讯");
        HomeSearchCommunicationFragment fragment2 = new HomeSearchCommunicationFragment();
        fragments.add(fragment2);
        strings.add("交流");
        HomeSearchAnswerFragment fragment3 = new HomeSearchAnswerFragment();
        fragments.add(fragment3);
        strings.add("问答");
        HomeSearchExpertFragment fragment4 = new HomeSearchExpertFragment();
        fragments.add(fragment4);
        strings.add("专家");
        HomeSearchVideoFragment fragment5 = new HomeSearchVideoFragment();
        fragments.add(fragment5);
        strings.add("视频");
        HomeSearchSupplyFragment fragment6 = new HomeSearchSupplyFragment();
        fragments.add(fragment6);
        strings.add("供求");

    }
}
