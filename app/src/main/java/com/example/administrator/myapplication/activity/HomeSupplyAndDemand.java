package com.example.administrator.myapplication.activity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.RootListViewAdapter;
import com.example.administrator.myapplication.adapter.SubListViewAdapter;
import com.example.administrator.myapplication.adapter.TabFragmentShouYeAdapter;
import com.example.administrator.myapplication.fragment.HomeSupplyFragment;
import com.example.administrator.myapplication.fragment.HomeWantToBuyFragment;
import com.example.administrator.myapplication.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.List;

public class HomeSupplyAndDemand extends AppCompatActivity  {
    private ImageView home_supply_demand_back_iv;
    private TextView  home_supply_demand_type_tv;
    private TabLayout tabLayout_shouye;
    private ViewPager viewPager_shouye;
    private List<String> strings = new ArrayList<String>();
    private List<Fragment> fragments = new ArrayList<Fragment>();
    private PopupWindow mPopupWindow;
    /**
     * 二级菜单的根目录
     */
    private ListView rootListView;

    /**
     * 根目录的节点
     */
    private String[] roots = new String[] { "全部", "生产资料", "农业服务","土地","农副产品"};

    /**
     * 子目录节点
     */
    private String[][] sub_items = new String[][] {
            new String[] { "植保", "销售", "咨询", "农机", "运输","育苗","用工" },
            new String[] { "其他资源", "化肥", "兽药", "农机", "农药","饲料","种子(苗)" },
            new String[] { "植保", "销售", "咨询", "农机", "运输","育苗","用工" },
            new String[] { "转让", "互换", "合作", "出租", "转包","入股" },
            new String[] { "粮油", "干货", "水产", "花木", "水果","其他","蛋禽鸡"}
    };
    private ListView subListView;

    /**
     * 弹出的popupWindow布局
     */
    private LinearLayout popupLayout;

    /**
     * 子目录的布局
     */
    private FrameLayout subLayout;

    /**
     * 根目录被选中的节点
     */
    private int selectedPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__supply_and_demand);
        home_supply_demand_type_tv=(TextView)findViewById(R.id.home_supply_demand_type_tv);
        home_supply_demand_back_iv=(ImageView)findViewById(R.id.home_supply_demand_back_iv);
        home_supply_demand_type_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopBtn(ScreenUtils.getScreenWidth(HomeSupplyAndDemand.this),
                ScreenUtils.getScreenHeight(HomeSupplyAndDemand.this));
            }
        });
        home_supply_demand_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        initdate();
        initView();
    }
    private void initView(){
        tabLayout_shouye = (TabLayout)findViewById(R.id.tablayout_shouye);
        viewPager_shouye = (ViewPager)findViewById(R.id.viewpager_ShouYe);
        viewPager_shouye.setAdapter(new TabFragmentShouYeAdapter(fragments,strings,
                getSupportFragmentManager(),this));
        tabLayout_shouye.setupWithViewPager(viewPager_shouye);
        tabLayout_shouye.setTabTextColors(getResources().getColor(R.color.bar_grey_90)
                ,getResources().getColor(R.color.green));
    }

    private void initdate(){


        HomeSupplyFragment fragment1 = new HomeSupplyFragment();
        fragments.add(fragment1);
        strings.add("供应");
        HomeWantToBuyFragment fragment2 = new HomeWantToBuyFragment();
        fragments.add(fragment2);
        strings.add("求购");
    }

    private void showPopBtn(int screenWidth, int screenHeight) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = LayoutInflater.from(HomeSupplyAndDemand.this);
        popupLayout = (LinearLayout) inflater.inflate(R.layout.popupwindow_layout,null, false);
        rootListView = (ListView) popupLayout.findViewById(R.id.root_listview);
        final RootListViewAdapter adapter = new RootListViewAdapter(HomeSupplyAndDemand.this);
        adapter.setItems(roots);
        rootListView.setAdapter(adapter);

        /**
         * 子popupWindow
         */
        subLayout = (FrameLayout) popupLayout.findViewById(R.id.sub_popupwindow);

        /**
         * 初始化subListview
         */
        subListView = (ListView) popupLayout.findViewById(R.id.sub_listview);

        /**
         * 弹出popupwindow时，二级菜单默认隐藏，当点击某项时，二级菜单再弹出
         */
        subLayout.setVisibility(View.INVISIBLE);

        /**
         * 初始化mPopupWindow
         */
        mPopupWindow = new PopupWindow(popupLayout, screenWidth,
                LinearLayoutCompat.LayoutParams.MATCH_PARENT, true);

        /**
         * 有了mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
         * 这句可以使点击popupwindow以外的区域时popupwindow自动消失 但这句必须放在showAsDropDown之前
         */
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());

        /**
         * popupwindow的位置，第一个参数表示位于哪个控件之下 第二个参数表示向左右方向的偏移量，正数表示向左偏移，负数表示向右偏移
         * 第三个参数表示向上下方向的偏移量，正数表示向下偏移，负数表示向上偏移
         *
         */
        mPopupWindow.showAsDropDown(home_supply_demand_type_tv, -5, 125);// 在控件下方显示

        mPopupWindow.update();

        rootListView
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        // TODO Auto-generated method stub

                        /**
                         * 选中root某项时改变该ListView item的背景色
                         */
                        adapter.setSelectedPosition(position);
                        adapter.notifyDataSetInvalidated();

                        selectedPosition = position;

                        SubListViewAdapter subAdapter = new SubListViewAdapter(
                                HomeSupplyAndDemand.this, sub_items, position);
                        subListView.setAdapter(subAdapter);

                        /**
                         * 选中某个根节点时，使显示相应的子目录可见
                         */
                        subLayout.setVisibility(View.VISIBLE);
                        subListView
                                .setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                    @Override
                                    public void onItemClick(
                                            AdapterView<?> parent, View view,
                                            int position, long id) {
                                        // TODO Auto-generated method stub
                                        popupLayout.setVisibility(View.GONE);
                                        Toast.makeText(
                                                HomeSupplyAndDemand.this,
                                                sub_items[selectedPosition][position],
                                                Toast.LENGTH_SHORT).show();
                                    }
                                });

                    }
                });
    }

}
