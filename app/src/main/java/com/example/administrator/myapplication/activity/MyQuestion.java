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
import com.example.administrator.myapplication.fragment.HomeSearchCommunicationFragment;
import com.example.administrator.myapplication.fragment.MyQuickQuestionFragment;

import java.util.ArrayList;
import java.util.List;

public class MyQuestion extends AppCompatActivity {
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private List<String> strings = new ArrayList<String>();;
    private List<Fragment> fragments = new ArrayList<Fragment>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_question);

        initdate();
        initView();
    }
    private void initView(){
        ImageView reister_back_bt=(ImageView)findViewById(R.id.reister_back_bt);
        reister_back_bt.setOnClickListener(new View.OnClickListener() {
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


        MyQuickQuestionFragment fragment1 = new MyQuickQuestionFragment();
        fragments.add(fragment1);
        strings.add("快速提问");
        HomeSearchCommunicationFragment fragment2 = new HomeSearchCommunicationFragment();
        fragments.add(fragment2);
        strings.add("专家提问");
    }

}
