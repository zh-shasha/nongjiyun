package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.Exchange_item;

import java.util.List;

/**
 * Created by Administrator on 2018/6/3.
 */

public class HomeSearchCommAdapter  extends BaseAdapter {
    private List<Exchange_item> lists;
    private Context context;


    public HomeSearchCommAdapter(Context context, List<Exchange_item> lists) {
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
        final Exchange_item exchange_item = lists.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_quickquestion_lv, null, false);
            ImageView head_img = (ImageView) convertView.findViewById(R.id.item_exchange_iv);
            TextView name = convertView.findViewById(R.id.item_exchange_tv_name);
             TextView local = convertView.findViewById(R.id.item_exchange_tv_name);
            TextView identity = convertView.findViewById(R.id.item_exchange_tv_id);
            TextView article = convertView.findViewById(R.id.item_exchange_tv_article);
            ImageView article_img = convertView.findViewById(R.id.item_exchange_iv_picture);
            ImageView article_img2 = convertView.findViewById(R.id.item_exchange_iv_picture2);
            ImageView article_img3 = convertView.findViewById(R.id.item_exchange_iv_picture3);
            TextView tv_adress=convertView.findViewById(R.id.exchange_tv_content_address);
            TextView date = convertView.findViewById(R.id.item_exchange_tv_date);
            ImageView zan_img = convertView.findViewById(R.id.item_exchange_iv_zan);
            ImageView review_img = convertView.findViewById(R.id.item_exchange_iv_review);


            head_img.setImageResource(lists.get(position).getHead_img());
            name.setText(lists.get(position).getName());
            local.setText(lists.get(position).getLocal());
            identity.setText(lists.get(position).getIdentity());
            article.setText(lists.get(position).getArticle());
            article_img.setImageResource(lists.get(position).getArticle_img());
            article_img2.setImageResource(lists.get(position).getArticle_img());
            article_img3.setImageResource(lists.get(position).getArticle_img());

            tv_adress.setText(lists.get(position).getTv_adress());
            date.setText(lists.get(position).getDate());
            zan_img.setImageResource(lists.get(position).getZan_img());
            review_img.setImageResource(lists.get(position).getReview_img());
        }
        return convertView;
    }
}
