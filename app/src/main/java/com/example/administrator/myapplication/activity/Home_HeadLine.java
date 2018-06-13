package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.BecomeRichAdapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.HomeNewMenu;

import java.util.ArrayList;

public class Home_HeadLine extends AppCompatActivity implements View.OnClickListener {
    private TextView headline;
    private ArrayList<HomeNewMenu> becomeRichArrayList;
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


        initBecomeRich();

    }

    private void initBecomeRich() {
        becomeRichArrayList = new ArrayList<>();
        HomeNewMenu news1 = new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class);
        HomeNewMenu news2 = new HomeNewMenu(R.mipmap.home_lv_iv2, "集成推广水稻绿色水稻高品质高效技术模式", "2018-04-19", "阅读数：17人",Home_Details.class);
        HomeNewMenu news3 = new HomeNewMenu(R.mipmap.home_lv_iv3, "集成推广水稻绿色水稻高品质高效技术模式", "2018-06-14", "阅读数：217人",Home_Details.class);
        HomeNewMenu news4 = new HomeNewMenu(R.mipmap.home_lv_iv3, "集成推广水稻绿色水稻高品质高效技术模式", "2018-05-22", "阅读数：517人",Home_Details.class);
        becomeRichArrayList.add( new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class));
        becomeRichArrayList.add( new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class));
        becomeRichArrayList.add( new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class));
        becomeRichArrayList.add( new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class));
        becomeRichArrayList.add( new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class));
        becomeRichArrayList.add( new HomeNewMenu(R.mipmap.home_lv_iv1, "集成推广水稻绿色水稻高品质高效技术模式", "2018-01-15", "阅读数：207",Home_Details.class));
        becomeRichArrayList.add(news1);
        becomeRichArrayList.add(news2);
        becomeRichArrayList.add(news3);
        becomeRichArrayList.add(news4);
        becomeRichAdapter = new BecomeRichAdapter(this,becomeRichArrayList);
        becomelistview.setAdapter(becomeRichAdapter);

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