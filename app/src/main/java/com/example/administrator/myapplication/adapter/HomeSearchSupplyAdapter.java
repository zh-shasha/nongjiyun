package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.HomeSearchSupplyMenu;

import java.util.List;

/**
 * Created by Administrator on 2018/6/3.
 */

public class HomeSearchSupplyAdapter extends BaseAdapter {
    private Context context;
    private List<HomeSearchSupplyMenu> list;
    public HomeSearchSupplyAdapter(Context context, List<HomeSearchSupplyMenu> list) {
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
        final HomeSearchSupplyMenu listMenu=list.get(position);
        if (convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.homeserchsupplyitem, null, false);

            ImageView pic1 = convertView.findViewById(R.id.image1);
            TextView title = convertView.findViewById(R.id.texttitle);
            TextView content = convertView.findViewById(R.id.textcontent);
            TextView tip = convertView.findViewById(R.id.texttip);
            ImageView pic2=convertView.findViewById(R.id.imageadress);
            TextView adress=convertView.findViewById(R.id.textadress);
            TextView date=convertView.findViewById(R.id.textdate);

            pic1.setImageResource(listMenu.getImage1());
            title.setText(listMenu.getTitle());
            date.setText(listMenu.getDate());
            content.setText(listMenu.getContent());
            tip.setText(listMenu.getTip());
            pic2.setImageResource(listMenu.getImage2());
            adress.setText(listMenu.getAdress());

        }
        return convertView;
    }
}
