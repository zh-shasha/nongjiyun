package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomeAddFriendsListAdapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.HomeAddFriendsListMenu;

import java.util.ArrayList;
import java.util.List;

public class HomeAddFriendsList extends AppCompatActivity {
    private ListView home_add_friends_lv;
    private List<HomeAddFriendsListMenu> list;
    private HomeAddFriendsListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_add_friends_list);
        home_add_friends_lv=(ListView)findViewById(R.id.home_add_friends_lv);
        list=new ArrayList<>();
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, HomeAddFriendsDetail.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));
        list.add(new HomeAddFriendsListMenu(R.mipmap.icon_default_head,"张金龙","农技推广人员",R.mipmap.btn_into_normal, Home_Details.class));

        adapter=new HomeAddFriendsListAdapter(this,list);
        home_add_friends_lv.setAdapter(adapter);
        home_add_friends_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(HomeAddFriendsList.this,list.get(position).getUrl());
                startActivity(intent);
            }
        });
    }
}
