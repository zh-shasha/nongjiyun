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

import java.util.ArrayList;
import java.util.List;

public class BecomeRichAdapter extends BaseAdapter {
    private Context context;
    private List<HomeNewMenu> becomeRichArrayList;
    public BecomeRichAdapter(Context context, ArrayList<HomeNewMenu> becomeRichArrayList){
         this.context=context;
        this.becomeRichArrayList=becomeRichArrayList;
    }


    @Override
    public int getCount() {
        return becomeRichArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final HomeNewMenu homeNewMenu = becomeRichArrayList.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_news,null, false);
            ImageView pic = convertView.findViewById(R.id.home_iv_news_pic);
            TextView title = convertView.findViewById(R.id.home_iv_news_title);
            TextView date = convertView.findViewById(R.id.home_iv_news_date);
            TextView read = convertView.findViewById(R.id.home_iv_news_read);
            pic.setImageResource(homeNewMenu.getImage());
            title.setText(homeNewMenu.getTitle());
            date.setText(homeNewMenu.getTime());
            read.setText(homeNewMenu.getRead());



//          top.setText(becomeRiches.get(position).getTop());
//          if(position<3){
//              top.setVisibility(View.VISIBLE);
//          } else {
//              top.setVisibility(View.GONE);
          }
            return convertView;

    }
}
