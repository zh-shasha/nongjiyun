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
import com.example.administrator.myapplication.fragment.HomeSearchAnswerFragment;
import com.example.administrator.myapplication.fragment.HomeSearchCommunicationFragment;
import com.example.administrator.myapplication.fragment.HomeSearchExpertFragment;
import com.example.administrator.myapplication.fragment.HomeSearchSupplyFragment;
import com.example.administrator.myapplication.fragment.HomeSearchVideoFragment;
import com.example.administrator.myapplication.fragment.HomeVideo1Fragment;

import java.util.ArrayList;
import java.util.List;

public class Home_video extends AppCompatActivity {
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private List<String> strings = new ArrayList<String>();
    private List<Fragment> fragments = new ArrayList<Fragment>();
    private ImageView home_video_back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_video);
        initdate();
        initView();
    }
    private void initView(){
        home_video_back_iv=(ImageView)findViewById(R.id.home_video_back_iv);
        home_video_back_iv.setOnClickListener(new View.OnClickListener() {
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
        tabLayout_shouye.setTabTextColors(getResources().getColor(R.color.bar_grey_90)
                ,getResources().getColor(R.color.green));
    }

    private void initdate(){
        HomeVideo1Fragment fragment1 = new HomeVideo1Fragment();
        fragments.add(fragment1);
        strings.add("推荐");
        HomeSearchCommunicationFragment fragment2 = new HomeSearchCommunicationFragment();
        fragments.add(fragment2);
        strings.add("种植");
        HomeSearchAnswerFragment fragment3 = new HomeSearchAnswerFragment();
        fragments.add(fragment3);
        strings.add("园艺");
        HomeSearchExpertFragment fragment4 = new HomeSearchExpertFragment();
        fragments.add(fragment4);
        strings.add("畜禽");
        HomeSearchVideoFragment fragment5 = new HomeSearchVideoFragment();
        fragments.add(fragment5);
        strings.add("水产");
        HomeSearchSupplyFragment fragment6 = new HomeSearchSupplyFragment();
        fragments.add(fragment6);
        strings.add("其他");

    }
    }

