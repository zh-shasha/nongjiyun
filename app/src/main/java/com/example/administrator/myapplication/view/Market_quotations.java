package com.example.administrator.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.TabFragmentShouYeAdapter;
import com.example.administrator.myapplication.fragment.HomeQuotations1Fragment;
import com.example.administrator.myapplication.fragment.Home_Details;

import java.util.ArrayList;
import java.util.List;

public class Market_quotations extends AppCompatActivity {
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private LinearLayout home_market_layout_top;
    private List<String> strings = new ArrayList<String>();;
    private List<Fragment> fragments = new ArrayList<Fragment>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_quotations);

        initdate();
        initView();
        ImageView agricultural_expert_back_iv=findViewById(R.id.agricultural_expert_back_iv);
        agricultural_expert_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void initView(){
        tabLayout_shouye = (TabLayout)findViewById(R.id.tablayout_shouye);
        viewPager_shouye = (ViewPager)findViewById(R.id.viewpager_ShouYe);
        home_market_layout_top=(LinearLayout)findViewById(R.id.home_market_layout_top);
        home_market_layout_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Market_quotations.this, Home_Details.class);
                intent.putExtra("view","http://njy.jsnjy.net.cn/web/share/new.action?newId=c74ab9c4-91b7-4725-8e79-9f1a442d11ab\n");
                startActivity(intent);
            }
        });

        viewPager_shouye.setAdapter(new TabFragmentShouYeAdapter(fragments,strings,
                getSupportFragmentManager(),this));
        tabLayout_shouye.setupWithViewPager(viewPager_shouye);
        tabLayout_shouye.setTabTextColors(getResources().getColor(R.color.bar_grey_90)
                ,getResources().getColor(R.color.green));
    }

    private void initdate(){
        HomeQuotations1Fragment fragment1 = new HomeQuotations1Fragment();
        fragments.add(fragment1);
        strings.add("价格行情");
        HomeQuotations1Fragment fragment2 = new HomeQuotations1Fragment();
        fragments.add(fragment2);
        strings.add("市场聚焦");
    }

}
