package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomeNoticeAdapter;
import com.example.administrator.myapplication.moduels.HomeNoticeMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Notice_System_Fragment extends Fragment {
    private ListView system_lv;
    private List<HomeNoticeMenu> noticeMenus;
    private HomeNoticeAdapter adapter;
    private List<String>  urls;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        initview(view);
        initDate();
        return view;
    }

    private void initDate() {
        noticeMenus=new ArrayList<>();
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://www.niit.edu.cn/46/64/c2086a18020/page.htm"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://www.niit.edu.cn/46/64/c2086a18020/page.htm"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=2705eb74-a38d-43fd-90c0-bc30c423e80c"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));
        noticeMenus.add(new HomeNoticeMenu(R.mipmap.icon_notice,"农技耘","农业农村部部长韩长赋来","2018-06-08" ,Home_Details.class,"http://new.qq.com/omn/20180601/20180601A0AMRP.html"));

        adapter=new HomeNoticeAdapter(getActivity(),noticeMenus);
        system_lv.setAdapter(adapter);

        urls=new ArrayList<>();

        system_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),Home_Details.class);
                intent.putExtra("view",noticeMenus.get(position).getNeturl());
                startActivity(intent);
            }
        });
    }

    private void initview(View view) {
        system_lv=(ListView)view.findViewById(R.id.home_notice_system);
    }

}
