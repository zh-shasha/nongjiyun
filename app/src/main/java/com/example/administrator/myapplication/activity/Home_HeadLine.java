package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.BecomeRichAdapter;
import com.example.administrator.myapplication.moduels.BecomeRich;

import java.util.ArrayList;

public class Home_HeadLine extends AppCompatActivity implements View.OnClickListener {
    private TextView headline;
    private ArrayList<BecomeRich> becomeRichArrayList;
    private ListView becomelistview;
    private BecomeRichAdapter becomeRichAdapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_head_line);
        headline = (TextView) findViewById(R.id.home_headline_tv);
        becomeRichArrayList = new ArrayList<>();
        becomelistview =(ListView)findViewById(R.id.home_headline_lv);
        back = (ImageView)findViewById(R.id.btn_headline_back);
        back.setOnClickListener(this);
        becomeRichAdapter = new BecomeRichAdapter(this, becomeRichArrayList);
        becomelistview.setAdapter(becomeRichAdapter);
        initBecomeRich();

    }

    private void initBecomeRich() {
        becomeRichArrayList.add(new BecomeRich(R.mipmap.ic_launcher, "夏季蔬菜施肥七注意",
                "2017-09-07", "水产", "置顶"));
        becomeRichArrayList.add(new BecomeRich(R.mipmap.ic_launcher, "夏季蔬菜施肥七注意",
                "2017-09-07", "水产", "置顶"));
        becomeRichArrayList.add(new BecomeRich(R.mipmap.ic_launcher, "夏季蔬菜施肥七注意",
                "2017-09-07", "水产", "置顶"));
        becomeRichArrayList.add(new BecomeRich(R.mipmap.ic_launcher, "夏季蔬菜施肥七注意",
                "2017-09-07", "水产", "置顶"));
        becomeRichArrayList.add(new BecomeRich(R.mipmap.ic_launcher, "夏季蔬菜施肥七注意",
                "2017-09-07", "水产", "置顶"));
        becomeRichArrayList.add(new BecomeRich(R.mipmap.ic_launcher, "夏季蔬菜施肥七注意",
                "2017-09-07", "水产", "置顶"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_headline_back:
                finish();
                break;

//    @Override
//    public void onClick(View v) {
//
//    }
//}
        }
    }
}