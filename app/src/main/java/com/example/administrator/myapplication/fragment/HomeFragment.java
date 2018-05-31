package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.administrator.myapplication.activity.Activity_login;
import com.example.administrator.myapplication.activity.Home_HeadLine;
import com.example.administrator.myapplication.activity.Home_MediaPlayer;

import com.example.administrator.myapplication.activity.Home_Trends;
import com.example.administrator.myapplication.activity.Home_video;

import com.example.administrator.myapplication.adapter.HomeNewAdapter;

import com.example.administrator.myapplication.adapter.HomeVideoAdapter;
import com.example.administrator.myapplication.adapter.MyGridAdapter;
import com.example.administrator.myapplication.adapter.SampleAdapter03;
import com.example.administrator.myapplication.moduels.HomeMenu;
import com.example.administrator.myapplication.moduels.HomeNewMenu;
import com.example.administrator.myapplication.moduels.HomeVideoMenu;
import com.example.administrator.myapplication.moduels.Model01;
import com.example.administrator.myapplication.moduels.Weather;
import com.example.administrator.myapplication.view.Agricultural_of_technology;
import com.example.administrator.myapplication.view.Agricultural_policy;
import com.example.administrator.myapplication.view.GrideViewScroll;
import com.example.administrator.myapplication.view.Life_service;
import com.example.administrator.myapplication.view.Market_quotations;
import com.example.administrator.myapplication.view.Professional_cooperation;
import com.example.administrator.myapplication.view.Science_and_technology_special;
import com.example.administrator.myapplication.view.agricultural_expert;
import com.example.administrator.myapplication.view.timeof_farming;
import com.example.administrator.myapplication.R;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.taobao.library.VerticalBannerView;

import java.util.ArrayList;
import java.util.List;

import static android.graphics.Color.*;

/**
 * A simple {@link Fragment} subclass.
 */

public class HomeFragment extends Fragment {
    private List<Weather.ForecastBean> list;
    private RollPagerView mRollViewPager;
    private  RefreshLayout refreshLayout;
    private GrideViewScroll grid_main;
    private List<HomeMenu>menus;
    private List<HomeNewMenu> newMenus;
    private MyGridAdapter adapter;
    private HomeNewAdapter adapter1;
    private ListView home_news_lv;
    private List<HomeVideoMenu> videoMenus;
    private RadioButton rb;
    private HomeVideoAdapter adapter3;
    private GrideViewScroll grid_video;
    private EditText home_et;
    private ImageView notice;
    private ImageView person;
    private GridView gridView;
    private ImageView home_iv_person;
    private TextView headline;
    private TextView trends;
    private TextView video_tv;
   // private FirstWeatherListAdapter weatherListAdapter;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        initEvent();
        initMenus();


        List<Model01> datas03 = new ArrayList<>();
        datas03.add(new Model01("聚焦】农业农村部部长韩长赋来宁调研农业科技创新工作：要放活成果放活人员放活机构",Home_Details.class));
        datas03.add(new Model01("有问有答】石榴树干腐病高发期如何处理等问答14则",Home_Details.class));
        datas03.add(new Model01("专家发布】桃树套袋即将开始，这些问题须注意", Home_Details.class));
        datas03.add(new Model01("发展和改革创新】南京市浦口区社区股份合作制改革",Home_Details.class));
        SampleAdapter03 adapter03 = new SampleAdapter03(getActivity(),datas03);
        VerticalBannerView banner03 = view.findViewById(R.id.banner_03);
        banner03.setAdapter(adapter03);
             banner03.start();

        return view;
    }
    private void initMenus() {
        menus = new ArrayList<>();
        HomeMenu gv1 = new HomeMenu(R.mipmap.zhuanyehezuo, "专业合作", Professional_cooperation.class);
        HomeMenu gv2 = new HomeMenu(R.mipmap.yongshinongshi, "应时农事", timeof_farming.class);
        HomeMenu gv3 = new HomeMenu(R.mipmap.nongyekeji, "农业科技", Agricultural_of_technology.class);
        HomeMenu gv4 = new HomeMenu(R.mipmap.nongyezhuanjia, "农业专家", agricultural_expert.class);
        HomeMenu gv5 = new HomeMenu(R.mipmap.nongyezhengce, "农业政策", Agricultural_policy.class);
        HomeMenu gv6 = new HomeMenu(R.mipmap.kejizhuanxiang, "科技专项", Science_and_technology_special.class);
        HomeMenu gv7 = new HomeMenu(R.mipmap.shichanghangqing, "市场行情", Market_quotations.class);
        HomeMenu gv8 = new HomeMenu(R.mipmap.shenghuofuwu, "生活服务", Life_service.class);
        HomeMenu gv9 = new HomeMenu(R.mipmap.icon_more_11, "更多", null);

        menus.add(gv1);
        menus.add(gv2);
        menus.add(gv3);
        menus.add(gv4);
        menus.add(gv5);
        menus.add(gv6);
        menus.add(gv7);
        menus.add(gv8);
        menus.add(gv9);
        adapter = new MyGridAdapter(getActivity(), menus);
        grid_main.setAdapter(adapter);

        newMenus = new ArrayList<>();
        HomeNewMenu news1 = new HomeNewMenu(R.mipmap.home_lv_iv1, "聪明人", "2017-1-1", "2017人",Home_Details.class);
        HomeNewMenu news2 = new HomeNewMenu(R.mipmap.home_lv_iv2, "聪明人", "2017-1-1", "2017人",Home_Details.class);
        HomeNewMenu news3 = new HomeNewMenu(R.mipmap.home_lv_iv3, "聪明人", "2017-1-1", "2017人",Home_Details.class);
        HomeNewMenu news4 = new HomeNewMenu(R.mipmap.home_lv_iv3, "聪明人", "2017-1-1", "2017人",Home_Details.class);
        newMenus.add(news1);
        newMenus.add(news2);
        newMenus.add(news3);
        newMenus.add(news4);
        adapter1=new HomeNewAdapter(getActivity(),newMenus);
        home_news_lv.setAdapter(adapter1);


        List<HomeVideoMenu>  videoMenus=new ArrayList<>();
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv1,"球根花卉种类及生产技术要点",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv2,"农村电商发展及案例解析",Home_MediaPlayer.class));
        adapter3=new HomeVideoAdapter(getActivity(),videoMenus);
        grid_video.setAdapter(adapter3);

        list=new ArrayList<>();

    }


    private void initEvent() {

        home_news_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),newMenus.get(position).getUrl());
                startActivity(intent);
            }
        });
        video_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Home_video.class);
                startActivity(intent);
            }
        });
        trends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Home_Trends.class);
                startActivity(intent);
            }
        });
        headline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Home_HeadLine.class);
                startActivity(intent);
            }
        });
        home_iv_person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Activity_login.class);
                startActivity(intent);
            }
        });

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),HomeFragment_notice.class);
                startActivity(intent);
            }
        });
        home_et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                //获取焦点
                if (hasFocus){
                    Intent intent=new Intent(getActivity(),HomeFragment_notice.class);
                    startActivity(intent);

                }
            }
        });

//        grid_main.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//                // TODO Auto-generated method stub
//                if (position==1){
//                    Intent intent=new Intent(getActivity(),AskFragment.class);
//                     startActivity(intent);
//                }
//                ConsoleItemClick(position);
//            }
//
//            private void ConsoleItemClick(int position) {
//
//            }
//        });
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
            }
        });
    }
    private void initView(View view) {
        refreshLayout = view.findViewById(R.id.refreshLayout);
        mRollViewPager = (RollPagerView) view.findViewById(R.id.roll_view_pager);
        grid_main = (GrideViewScroll) view.findViewById(R.id.grid_main);
        home_news_lv=(ListView)view.findViewById(R.id.home_news_lv);
        grid_video=(GrideViewScroll)view.findViewById(R.id.grid_video);
        home_et=(EditText)view.findViewById(R.id.home_et);
        notice=(ImageView)view.findViewById(R.id.home_iv_notice);
        person=(ImageView)view.findViewById(R.id.home_iv_person);
        home_iv_person=(ImageView)view.findViewById(R.id.home_iv_person);
        headline=(TextView)view.findViewById(R.id.home_headline_tv);
        trends=(TextView)view.findViewById(R.id.home_trends_tv);
        video_tv=(TextView)view.findViewById(R.id.home_video_tv);
    }








    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //设置播放时间间隔
        mRollViewPager.setPlayDelay(2000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
        mRollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.WHITE,GRAY));
    }


        private class TestNormalAdapter extends StaticPagerAdapter {
            private int[] imgs = {
                    R.mipmap.photo1,
                    R.mipmap.photo2,
                    R.mipmap.photo3,
                    R.mipmap.photo4,


            };
            @Override
            public int getCount() {
                return imgs.length;
            }

            @Override
            public View getView(ViewGroup container, final int position) {
                final ImageView view = new ImageView(container.getContext());
                view.setImageResource(imgs[position]);

                view.setScaleType(ImageView.ScaleType.CENTER_CROP);
                view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),Home_Details.class);
                        startActivity(intent);
                    }
                });
                return view;
            }




    }

}
