package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.moduels.BecomeRich;

import java.util.ArrayList;
import java.util.List;

public class BecomeRichAdapter extends BaseAdapter {
    private LayoutInflater blinearLayout;
    private List<BecomeRich> becomeRiches;
    public BecomeRichAdapter(Context context, ArrayList<BecomeRich> becomeRiches){
        blinearLayout= LayoutInflater.from(context);
        this.becomeRiches=becomeRiches;
    }


    @Override
    public int getCount() {
        return becomeRiches.size();
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
    public View getView(int position, View view, ViewGroup parent) {

           view = blinearLayout.inflate(R.layout.item_becomerich, null);
          ImageView becomeimage = view.findViewById(R .id.iv_become_image);
          TextView becometitle = view.findViewById(R.id.tv_become_title);
          TextView becomenum = view.findViewById(R.id.tv_become_num);
          TextView becometype = view.findViewById(R.id.tv_become_type);
          TextView top =view.findViewById(R.id.tv_top);

          becomeimage.setImageResource(becomeRiches.get(position).getImage());
          becometitle.setText(becomeRiches.get(position).getTitle());
          becomenum.setText(becomeRiches.get(position).getNum());
          becometype.setText(becomeRiches.get(position).getType());
          top.setText(becomeRiches.get(position).getTop());
          if(position<3){
              top.setVisibility(View.VISIBLE);
          } else {
              top.setVisibility(View.GONE);
          }
          return view;
    }
}
