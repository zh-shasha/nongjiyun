package com.example.administrator.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;

import com.example.administrator.myapplication.moduels.Knowledge_Menu_Professor;
import com.example.administrator.myapplication.utils.ScreenUtil;

import java.util.List;

public class Knowledge_Menu_ProfessorAdapter extends BaseAdapter {
    private List<Knowledge_Menu_Professor> list;
    private Context context;

    public Knowledge_Menu_ProfessorAdapter(Context context, List<Knowledge_Menu_Professor> list){
        this.context=context;
        this.list=list;
    }
    @Override
    public int getCount() {
        return 15;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        RadioButton rb=new RadioButton(context);

            rb.setButtonDrawable(null);
            rb.setBackgroundColor(Color.WHITE);
            rb.setBackgroundResource(list.get(position).getImg());
//            rb.setCompoundDrawablesWithIntrinsicBounds(0,list.get(position).getImg(),0,0);
            rb.setCompoundDrawablePadding(ScreenUtil.dip2px(context,5));
            rb.setGravity(Gravity.CENTER);
            rb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,list.get(position).getaClass());
                    context.startActivity(intent);
                }
            });

        return rb;
    }
}
