package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;

import com.example.administrator.myapplication.moduels.HomeVideoMenu;
import com.example.administrator.myapplication.utils.ScreenUtil;

import java.util.List;

/**
 * Created by Administrator on 2018/4/29.
 */

public class HomeVideoAdapter extends BaseAdapter {
    private Context context;
    private List<HomeVideoMenu> videoMenus;
    public HomeVideoAdapter(Context context,List<HomeVideoMenu> videoMenus){
        this.videoMenus=videoMenus;
        this.context=context;
    }
    @Override
    public int getCount() {
        return videoMenus.size();
    }

    @Override
    public Object getItem(int position) {
        return videoMenus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
       // GrideViewScroll grid_video=(GrideViewScroll)convertView.findViewById(R.id.grid_video);
        final HomeVideoMenu homeVideoMenu = videoMenus.get(position);
        RadioButton rb=new RadioButton(context);
        rb.setText(videoMenus.get(position).getTv_video());
        rb.setButtonDrawable(null);
        rb.setBackgroundColor(Color.WHITE);
        rb.setCompoundDrawablesWithIntrinsicBounds(0, videoMenus.get(position).getIv_video(), 0, 0);
        rb.setCompoundDrawablePadding(ScreenUtil.dip2px(context, 10));
        rb.setPadding(20,20,20,20);
        rb.setGravity(Gravity.CENTER);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, videoMenus.get(position).getVideo_url());
                context.startActivity(intent);
            }
        });
        return rb;
    }
}
