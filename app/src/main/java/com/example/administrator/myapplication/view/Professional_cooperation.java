package com.example.administrator.myapplication.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Home_cooperation_TabAdapter;
import com.example.administrator.myapplication.fragment.Home_Cooperation_LogoFragment;
import com.example.administrator.myapplication.fragment.Home_Directory_Library_Fragment;

import java.util.ArrayList;
import java.util.List;

public class Professional_cooperation extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager viewpager;
    private Home_cooperation_TabAdapter adapter;
    private ImageView pro_coop_back_iv;
//    private ListView listView1;
//    private ListView listView2;
//    private ListView listView3;
//    private ListView listView4;
//    private List<HomeProfessionalCooperationMenu> cooperationMenus1;
//    private List<HomeCooperationLibraryMenu> cooperationMenus2;
//    private HomeProfessionalCooperationAdapter adapter1;
//    private HomeCooperationLibraryAdapter adapter2;
//    ;

    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_professional_cooperation);
        initviews();
        //  initDate();
        //  initClick();

    }

    private void initviews() {
        pro_coop_back_iv=(ImageView)findViewById(R.id.pro_coop_back_iv);
        pro_coop_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 finish();
            }
        });
        tab = (TabLayout) findViewById(R.id.tab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        String[] tabTitle = new String[]{"合作品牌", "合作风采", "政策法规", "名录库"};
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Home_Cooperation_LogoFragment());
        fragments.add(new Home_Directory_Library_Fragment());
        fragments.add(new Home_Cooperation_LogoFragment());
        fragments.add(new Home_Directory_Library_Fragment());
        adapter = new Home_cooperation_TabAdapter(getSupportFragmentManager(), fragments, tabTitle);
        //给ViewPager设置适配器
        viewpager.setAdapter(adapter);
        //将TabLayout和ViewPager关联起来。
        tab.setupWithViewPager(viewpager);
        //设置可以滑动
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);
        tab.setTabMode(TabLayout.MODE_FIXED);
    }
}



