package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.Ask_item;

import java.util.List;

/**
 * Created by Administrator on 2018/6/7.
 */

public class Ask_itemAdapter extends BaseAdapter {
    private Context context;
    private List<Ask_item> lists;

    public Ask_itemAdapter(Context context, List<Ask_item> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_ask_lv, null, false);
            ImageView head_img = (ImageView) convertView.findViewById(R.id.item_exchange_iv);
            TextView name = convertView.findViewById(R.id.item_exchange_tv_name);
            final TextView local = convertView.findViewById(R.id.item_exchange_tv_local);
            TextView expert_type=convertView.findViewById(R.id.text_expert_type);
            TextView identity = convertView.findViewById(R.id.item_exchange_tv_id);
            TextView article = convertView.findViewById(R.id.item_exchange_tv_article);
            ImageView article_img = convertView.findViewById(R.id.item_exchange_iv_picture);
            ImageView article_img2 = convertView.findViewById(R.id.item_exchange_iv_picture2);
            ImageView article_img3 = convertView.findViewById(R.id.item_exchange_iv_picture3);
            TextView date = convertView.findViewById(R.id.item_exchange_tv_date);
            TextView text_already=convertView.findViewById(R.id.text_already_response);


            head_img.setImageResource(lists.get(position).getHead_img());
            name.setText(lists.get(position).getName());
            local.setText(lists.get(position).getLocal());
            identity.setText(lists.get(position).getIdentity());
            article.setText(lists.get(position).getArticle());
            article_img.setImageResource(lists.get(position).getArticle_img());
            article_img2.setImageResource(lists.get(position).getArticle_img());
            article_img3.setImageResource(lists.get(position).getArticle_img());
            date.setText(lists.get(position).getDate());
            expert_type.setText(lists.get(position).getExpert_type());
            text_already.setText(lists.get(position).getResponse());
        }
        return convertView;
    }
}