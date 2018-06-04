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
public class HomeVideo1Fragment extends Fragment {

    private GrideViewScroll home_grid_videol;
    private List<HomeVideoMenu> videoMenus;
    private HomeVideoAdapter adapter4;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_video1, container, false);
        home_grid_videol=(GrideViewScroll)view.findViewById(R.id.home_grid_videol);
        List<HomeVideoMenu> videoMenus=new ArrayList<>();
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv1,"球根花卉种类及生产技术要点",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv2,"农村电商发展及案例解析",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv1,"球根花卉种类及生产技术要点",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv2,"农村电商发展及案例解析",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv1,"球根花卉种类及生产技术要点",Home_MediaPlayer.class));
        videoMenus.add(new HomeVideoMenu(R.mipmap.grid_item2_iv2,"农村电商发展及案例解析",Home_MediaPlayer.class));

        adapter4=new HomeVideoAdapter(getActivity(),videoMenus);
        home_grid_videol.setAdapter(adapter4);
        return view;
    }

}
