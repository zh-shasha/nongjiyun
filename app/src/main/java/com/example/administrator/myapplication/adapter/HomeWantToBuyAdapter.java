package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.HomeWantToBuyMenu;

import java.util.List;

/**
 * Created by Administrator on 2018/6/7.
 */

public class HomeWantToBuyAdapter extends BaseAdapter{
    private Context context;
    private List<HomeWantToBuyMenu> list;

    public HomeWantToBuyAdapter(Context context, List<HomeWantToBuyMenu> list) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_want_to_buy, null, false);
            ImageView img = convertView.findViewById(R.id.imageView7);
            TextView title = convertView.findViewById(R.id.text_title);
            TextView date = convertView.findViewById(R.id.text_time);
            TextView context = convertView.findViewById(R.id.text_content);
            TextView city=convertView.findViewById(R.id.text_adress);
            TextView top=convertView.findViewById(R.id.text_top);

            title.setText(list.get(position).getTitie());
            date.setText(list.get(position).getDate());
            context.setText(list.get(position).getContext());
            img.setImageResource(list.get(position).getImage());
            top.setText(list.get(position).getTop());
            city.setText(list.get(position).getCity());
        }


        return convertView;
    }
}
