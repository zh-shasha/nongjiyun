package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.HomeSearchTabAnswerMenu;

import java.util.List;

/**
 * Created by Administrator on 2018/6/3.
 */

public class HomeSearchAnswerAdapter extends BaseAdapter {
    private List<HomeSearchTabAnswerMenu> lists;
    private Context context;


    public HomeSearchAnswerAdapter(Context context, List<HomeSearchTabAnswerMenu> lists) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_search_answer_lv, null, false);
            ImageView head_img = convertView.findViewById(R.id.item_exchange_iv);
            TextView name = convertView.findViewById(R.id.item_exchange_tv_name);
             TextView local = convertView.findViewById(R.id.item_exchange_tv_name);
            TextView identity = convertView.findViewById(R.id.item_exchange_tv_id);
            TextView article = convertView.findViewById(R.id.item_exchange_tv_article);
            ImageView article_img = convertView.findViewById(R.id.item_exchange_iv_picture);
            ImageView article_img2 = convertView.findViewById(R.id.item_exchange_iv_picture2);
            ImageView article_img3 = convertView.findViewById(R.id.item_exchange_iv_picture3);
            TextView tv_adress=convertView.findViewById(R.id.exchange_tv_content_address);
            TextView date = convertView.findViewById(R.id.item_exchange_tv_date);
            TextView detail=convertView.findViewById(R.id.text_home_detali);
            TextView alredy_answer=convertView.findViewById(R.id.text_already_answer);

            head_img.setImageResource(lists.get(position).getHead_img());
            name.setText(lists.get(position).getName());
            local.setText(lists.get(position).getLocal());
            identity.setText(lists.get(position).getIdentity());
            article.setText(lists.get(position).getArticle());
            article_img.setImageResource(lists.get(position).getArticle_img());
            article_img2.setImageResource(lists.get(position).getArticle_img());
            article_img3.setImageResource(lists.get(position).getArticle_img());

            tv_adress.setText(lists.get(position).getTv_adress());
            detail.setText(lists.get(position).getDetail());
            alredy_answer.setText(lists.get(position).getAlready_answer());
            date.setText(lists.get(position).getDate());

        }
        return convertView;
    }
}
