package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.TabFragmentShouYeAdapter;
import com.example.administrator.myapplication.fragment.HomeSupplyFragment;
import com.example.administrator.myapplication.fragment.HomeWantToBuyFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeSupplyAndDemand extends AppCompatActivity {
    private ImageView home_supply_demand_back_iv;
    private TextView  home_supply_demand_type_tv;
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private List<String> strings = new ArrayList<String>();;
    private List<Fragment> fragments = new ArrayList<Fragment>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__supply_and_demand);
        home_supply_demand_type_tv=(TextView)findViewById(R.id.home_supply_demand_type_tv);
        home_supply_demand_back_iv=(ImageView)findViewById(R.id.home_supply_demand_back_iv);
        home_supply_demand_type_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeSupplyAndDemand.this,HomeDemandPush.class);
                startActivity(intent);
            }
        });
        home_supply_demand_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
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


        HomeSupplyFragment fragment1 = new HomeSupplyFragment();
        fragments.add(fragment1);
        strings.add("供应");
        HomeWantToBuyFragment fragment2 = new HomeWantToBuyFragment();
        fragments.add(fragment2);
        strings.add("求购");
    }

}
