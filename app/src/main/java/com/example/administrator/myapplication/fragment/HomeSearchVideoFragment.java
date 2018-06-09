package com.example.administrator.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.Home_MediaPlayer;
import com.example.administrator.myapplication.adapter.HomeVideoAdapter;
import com.example.administrator.myapplication.moduels.HomeVideoMenu;
import com.example.administrator.myapplication.view.GrideViewScroll;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchVideoFragment extends Fragment {
    private GrideViewScroll grid_video;
    private List<HomeVideoMenu> videoMenus;
    private HomeVideoAdapter adapter3;
    public HomeSearchVideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_search_video, container, false);
        grid_video=(GrideViewScroll)view.findViewById(R.id.grid_video);
        List<HomeVideoMenu> videoMenus=new ArrayList<>();

        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video1,"培育味稻，打造苏米品牌",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video2,"如何生产好稻米",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video3,"基于水稻专用的缓控释肥的水稻，插秧施肥一体化减量减排技术",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video4,"南梗系列优良食味新品种",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video1,"培育味稻，打造苏米品牌",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video1,"培育味稻，打造苏米品牌",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video1,"培育味稻，打造苏米品牌",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video2,"如何生产好稻米",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video3,"基于水稻专用的缓控释肥的水稻，插秧施肥一体化减量减排技术",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video4,"南梗系列优良食味新品种",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video1,"培育味稻，打造苏米品牌",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.iv_video1,"培育味稻，打造苏米品牌",Home_MediaPlayer.class));
        adapter3=new HomeVideoAdapter(getActivity(),videoMenus);
        grid_video.setAdapter(adapter3);
        return view;
    }

}
