package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.HomeNewMenu;

import java.util.List;

/**
 * Created by Administrator on 2018/6/3.
 */

public class HomeSearchInformationAdapter extends BaseAdapter{
    private Context context;
    private  List<HomeNewMenu> list;
    public HomeSearchInformationAdapter(Context context, List<HomeNewMenu> list) {
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

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_news,null, false);
            ImageView pic = convertView.findViewById(R.id.home_iv_news_pic);
            TextView title = convertView.findViewById(R.id.home_iv_news_title);
            TextView date = convertView.findViewById(R.id.home_iv_news_date);
            TextView read = convertView.findViewById(R.id.home_iv_news_read);
            pic.setImageResource(list.get(position).getImage());
            title.setText(list.get(position).getTitle());
            date.setText(list.get(position).getTime());
            read.setText(list.get(position).getRead());
        }
        return convertView;
    }
}
