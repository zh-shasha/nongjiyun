package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/5/6.
 */

public class DragAdapter extends BaseAdapter {
    private List<HashMap<String, Object>> list;
    private LayoutInflater mInflater;
    private int mHidePosition = -1;

    public DragAdapter(Context context, List<HashMap<String, Object>> list) {
        this.list = list;
        mInflater = LayoutInflater.from(context);
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
        convertView = mInflater.inflate(R.layout.more_dragitem, null);
        ImageView mImageView = (ImageView) convertView.findViewById(R.id.item_image);
        TextView mTextView = (TextView) convertView.findViewById(R.id.item_text);

        mImageView.setImageResource((Integer) list.get(position).get("item_image"));
        mTextView.setText((CharSequence) list.get(position).get("item_text"));

        if (position == mHidePosition) {
            convertView.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }
}
