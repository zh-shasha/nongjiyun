package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.HomeAddFriendsListMenu;

import java.util.List;

/**
 * Created by Administrator on 2018/6/4.
 */

public class HomeAddFriendsListAdapter extends BaseAdapter {
    private Context context;
    private List<HomeAddFriendsListMenu> list;
    public HomeAddFriendsListAdapter(Context context, List<HomeAddFriendsListMenu> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final HomeAddFriendsListMenu addmenu = list.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_add_friends,null, false);
            ImageView pic = convertView.findViewById(R.id.home_iv_news_pic);
            TextView name = convertView.findViewById(R.id.home_iv_news_title);
            TextView type = convertView.findViewById(R.id.home_iv_news_date);
            ImageView into = convertView.findViewById(R.id.home_iv_news_read);
            pic.setImageResource(addmenu.getImage());
            name.setText(addmenu.getName());
            type.setText(addmenu.getType());
            into.setImageResource(addmenu.getImage_into());
        }
        return convertView;
    }
}
