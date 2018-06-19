package com.example.administrator.myapplication.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.HomeBrandFarmCapital;
import com.example.administrator.myapplication.activity.HomeSupplyAndDemand;
import com.example.administrator.myapplication.adapter.GridViewAdapter;
import com.example.administrator.myapplication.moduels.HomeMoreMenu;
import com.example.administrator.myapplication.moduels.MyDragGridView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class more extends AppCompatActivity {
    private List<HashMap<String, Object>> dataSourceList = new ArrayList<HashMap<String, Object>>();
    private GridViewAdapter adapter;
    private List<HomeMoreMenu> strList;
    private ImageView home_grid_more_btn_back;
    private GridView gridView2;
    private List<String >strings;
    private List<Integer>maps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_more);
        strings=new ArrayList<>();
        maps=new ArrayList<>();
        strings.add("专业合作");
        strings.add("应时农事");
        strings.add("农业科技");
        strings.add("农业专家");
        strings.add("农业政策");
        strings.add("科技专项");
        strings.add("市场行情");
        strings.add("生活服务");
        maps.add(R.mipmap.zhuanyehezuo);
        maps.add(R.mipmap.yongshinongshi);
        maps.add(R.mipmap.nongyekeji);
        maps.add(R.mipmap.nongyezhuanjia);
        maps.add(R.mipmap.nongyezhengce);
        maps.add(R.mipmap.kejizhuanxiang);
        maps.add(R.mipmap.shichanghangqing);
        maps.add(R.mipmap.shenghuofuwu);
        initView();
        initData();

        initDrag();

    }

    private void initDrag() {
        MyDragGridView mDragGridView = (MyDragGridView) findViewById(R.id.dragGridView);
        for (int i = 0; i < 8; i++) {
            HashMap<String, Object> itemHashMap = new HashMap<String, Object>();
            itemHashMap.put("item_image",maps.get(i));
            itemHashMap.put("item_text", strings.get(i));
            dataSourceList.add(itemHashMap);
        }


        final SimpleAdapter mSimpleAdapter = new SimpleAdapter(this, dataSourceList,
                R.layout.more_dragitem,new String[] { "item_image", "item_text" },
                new int[] { R.id.item_image, R.id.item_text });

        mDragGridView.setAdapter(mSimpleAdapter);

        mDragGridView.setOnChangeListener(new MyDragGridView.OnChanageListener() {

            @Override
            public void onChange(int from, int to) {
//                HashMap<String, Object> temp = dataSourceList.get(from);
                // 直接交互item
//              dataSourceList.set(from, dataSourceList.get(to));
//              dataSourceList.set(to, temp);
//              dataSourceList.set(to, temp);


                //这里的处理需要注意下
                if(from < to){
                    for(int i=from; i<to; i++){
                        Collections.swap(dataSourceList, i, i+1);
                    }
                }else if(from > to){
                    for(int i=from; i>to; i--){
                        Collections.swap(dataSourceList, i, i-1);
                    }
                }

                mSimpleAdapter.notifyDataSetChanged();
            }
        });

        mDragGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                System.out.println("click " + position + "____" + dataSourceList.get(position).get("item_text"));

            }
        });
        home_grid_more_btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void initData() {
//        strList = new ArrayList<>();
//        HomeMenu gv1 = new HomeMenu(R.mipmap.ic_launcher, "专业合作", Professional_cooperation.class);
//        HomeMenu gv2 = new HomeMenu(R.mipmap.ic_launcher, "应用农事", timeof_farming.class);
//        HomeMenu gv3 = new HomeMenu(R.mipmap.ic_launcher, "农业科技", Agricultural_of_technology.class);
//        HomeMenu gv4 = new HomeMenu(R.mipmap.ic_launcher, "农业专家", agricultural_expert.class);
//        HomeMenu gv5 = new HomeMenu(R.mipmap.ic_launcher, "农业政策", Agricultural_policy.class);
//        HomeMenu gv6 = new HomeMenu(R.mipmap.ic_launcher, "科技专项", Science_and_technology_special.class);
//        HomeMenu gv7 = new HomeMenu(R.mipmap.ic_launcher, "市场行情", Market_quotations.class);
//        HomeMenu gv8 = new HomeMenu(R.mipmap.ic_launcher, "生活服务", null);
//        strList.add(gv1);
//        strList.add(gv2);
//        strList.add(gv3);
//        strList.add(gv4);
//        strList.add(gv5);
//        strList.add(gv6);
//        strList.add(gv7);
//        strList.add(gv8);
//
//
//        GridViewAdapter adapter = new GridViewAdapter(this, strList);
//        MyDragGridView.setAdapter(adapter);

        strList = new ArrayList<>();
        strList.add(new HomeMoreMenu(R.mipmap.gongqiuxinxi, "供求信息", HomeSupplyAndDemand.class));
        strList.add(new HomeMoreMenu(R.mipmap.chuangyezhifu, "创业致富", null));
        strList.add(new HomeMoreMenu(R.mipmap.nongyeqixiang, "农业气象", null));
        strList.add(new HomeMoreMenu(R.mipmap.xiangcunluxing, "乡村旅游", null));
        strList.add(new HomeMoreMenu(R.mipmap.yunshangzhineng, "云上智能", null));
        strList.add(new HomeMoreMenu(R.mipmap.pinpainongzi, "品牌农资", HomeBrandFarmCapital.class));
        strList.add(new HomeMoreMenu(R.mipmap.shilidianfan, "示例典范", null));
        adapter = new GridViewAdapter(more.this, strList);

        gridView2.setAdapter(adapter);
    }
    private void initView() {

        home_grid_more_btn_back=(ImageView)findViewById(R.id.home_grid_more_btn_back);
       gridView2 = (GridView)findViewById(R.id.drag_grid_view2);
    }
}



