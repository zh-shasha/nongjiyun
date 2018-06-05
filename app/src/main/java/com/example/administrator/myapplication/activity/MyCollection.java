package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.TabFragmentShouYeAdapter;
import com.example.administrator.myapplication.fragment.HomeSearchAnswerFragment;
import com.example.administrator.myapplication.fragment.HomeSearchCommunicationFragment;
import com.example.administrator.myapplication.fragment.HomeSearchVideoFragment;
import com.example.administrator.myapplication.fragment.HomeSearchinformationFragment;

import java.util.ArrayList;
import java.util.List;

public class MyCollection extends AppCompatActivity {
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private List<String> strings = new ArrayList<String>();;
    private List<Fragment> fragments = new ArrayList<Fragment>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_collection);

        initdate();
        initView();
    }
    private void initView(){
        tabLayout_shouye = (TabLayout)findViewById(R.id.tablayout_shouye);
        viewPager_shouye = (ViewPager)findViewById(R.id.viewpager_ShouYe);
        viewPager_shouye.setAdapter(new TabFragmentShouYeAdapter(fragments,strings,
                getSupportFragmentManager(),this));
        tabLayout_shouye.setupWithViewPager(viewPager_shouye);
        tabLayout_shouye.setTabTextColors(getResources().getColor(R.color.bar_grey_90)
                ,getResources().getColor(R.color.green));
    }

    private void initdate(){


        HomeSearchAnswerFragment fragment3 = new HomeSearchAnswerFragment();
        fragments.add(fragment3);
        strings.add("问答");
        HomeSearchCommunicationFragment fragment2 = new HomeSearchCommunicationFragment();
        fragments.add(fragment2);
        strings.add("交流");
        HomeSearchinformationFragment fragment1 = new HomeSearchinformationFragment();
        fragments.add(fragment1);
        strings.add("资讯");
        HomeSearchVideoFragment fragment5 = new HomeSearchVideoFragment();
        fragments.add(fragment5);
        strings.add("视频");


    }

}
