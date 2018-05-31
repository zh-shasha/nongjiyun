package com.example.administrator.myapplication.view;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.ViewFlipper;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomeCooperationLibraryAdapter;
import com.example.administrator.myapplication.adapter.HomeProfessionalCooperationAdapter;
import com.example.administrator.myapplication.adapter.Home_cooperation_TabAdapter;
import com.example.administrator.myapplication.adapter.TabAdapter;
import com.example.administrator.myapplication.fragment.Home_Cooperation_LogoFragment;
import com.example.administrator.myapplication.fragment.Home_Directory_Library_Fragment;
import com.example.administrator.myapplication.fragment.Home_Notice_System_Fragment;
import com.example.administrator.myapplication.moduels.HomeCooperationLibraryMenu;
import com.example.administrator.myapplication.moduels.HomeProfessionalCooperationMenu;

import java.util.ArrayList;
import java.util.List;

public class Professional_cooperation extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager viewpager;
    private Home_cooperation_TabAdapter adapter;
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
        tab = (TabLayout) findViewById(R.id.tab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        String[] tabTitle = new String[]{"合作品牌", "合作风采", "政策法规", "名录库"};
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Home_Cooperation_LogoFragment());
        fragments.add(new Home_Directory_Library_Fragment());
        fragments.add(new Home_Notice_System_Fragment());
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
//    private void initClick() {
//        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(Professional_cooperation.this, cooperationMenus1.get(position).getUrl());
//                startActivity(intent);
//            }
//        });
//    }
}
//    private void initDate() {
//        listView1 = (ListView) findViewById(R.id.home_professional_cooperation_lv1);
//        listView2 = (ListView) findViewById(R.id.home_professional_cooperation_lv2);
//        listView3 = (ListView) findViewById(R.id.home_professional_cooperation_lv3);
//        listView4 = (ListView) findViewById(R.id.home_professional_cooperation_lv4);
//        cooperationMenus1 = new ArrayList<>();
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        cooperationMenus1.add(new HomeProfessionalCooperationMenu(R.mipmap.ic_launcher, "开心就好", "2018-12-1", "299394", null));
//        adapter1 = new HomeProfessionalCooperationAdapter(this, cooperationMenus1);
//        listView1.setAdapter(adapter1);
//
//        cooperationMenus2 = new ArrayList<>();
//        cooperationMenus2.add(new HomeCooperationLibraryMenu(R.mipmap.ic_launcher, "开", "2018-12-1", "299394", null));
//        cooperationMenus2.add(new HomeCooperationLibraryMenu(R.mipmap.ic_launcher, "开", "2018-12-1", "299394", null));
//        cooperationMenus2.add(new HomeCooperationLibraryMenu(R.mipmap.ic_launcher, "开", "2018-12-1", "299394", null));
//        cooperationMenus2.add(new HomeCooperationLibraryMenu(R.mipmap.ic_launcher, "开", "2018-12-1", "299394", null));
//        cooperationMenus2.add(new HomeCooperationLibraryMenu(R.mipmap.ic_launcher, "开", "2018-12-1", "299394", null));
//        cooperationMenus2.add(new HomeCooperationLibraryMenu(R.mipmap.ic_launcher, "开", "2018-12-1", "299394", null));
//        adapter2 = new HomeCooperationLibraryAdapter(this, cooperationMenus2);
//        listView2.setAdapter(adapter2);
//
//    }
//}



