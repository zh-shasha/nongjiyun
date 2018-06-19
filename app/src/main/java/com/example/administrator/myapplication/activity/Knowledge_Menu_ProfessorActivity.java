package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Knowledge_Menu_ProfessorAdapter;
import com.example.administrator.myapplication.moduels.Knowledge_Menu_Professor;
import com.example.administrator.myapplication.view.HomeMenuGridView;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

public class Knowledge_Menu_ProfessorActivity extends AppCompatActivity {
    private List<Knowledge_Menu_Professor> list;
    private HomeMenuGridView gridView;
    private Knowledge_Menu_ProfessorAdapter adapter;
    private Button button;
    private RefreshLayout refreshLayout;
    private ImageView agricultural_expert_back_iv;
    private HomeMenuGridView knowledge_menu_professor_gv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_menu__professor);
        initView();
        refreshLayout = findViewById(R.id.refreshLayout);
        agricultural_expert_back_iv=(ImageView)findViewById(R.id.agricultural_expert_back_iv);
        agricultural_expert_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initData();
        initEvent();

    }

    private void initEvent() {
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
            }
        });
        refreshLayout.setEnableLoadMore(false);//禁止上划
//        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
//            @Override
//            public void onLoadMore(RefreshLayout refreshlayout) {
//                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
//            }
//        });


    }

    private void initData() {

        gridView = (HomeMenuGridView) findViewById(R.id.knowledge_menu_professor_gv);
        list = new ArrayList<>();

        Knowledge_Menu_Professor h1 = new Knowledge_Menu_Professor(R.mipmap.shuidao, "水稻产业技术体系", Knowledge_Menu_Pro_RiceActivity.class);
        Knowledge_Menu_Professor h2 = new Knowledge_Menu_Professor(R.mipmap.xiaomai, "小麦产业技术体系", Knowledge_Menu_Pro_WheatActivity.class);
        Knowledge_Menu_Professor h3 = new Knowledge_Menu_Professor(R.mipmap.tejing, "特粮特经产业技术体系", Knowledge_Menu_Pro_TLTActivity.class);
        Knowledge_Menu_Professor h4 = new Knowledge_Menu_Professor(R.mipmap.shucai, "蔬菜产业技术体系", Knowledge_Menu_Pro_VegActivity.class);
        Knowledge_Menu_Professor h5 = new Knowledge_Menu_Professor(R.mipmap.xitiangau, "西甜瓜产业技术体系", Knowledge_Menu_Pro_WatActivity.class);
        Knowledge_Menu_Professor h6 = new Knowledge_Menu_Professor(R.mipmap.putao, "葡萄产业技术体系", null);
        Knowledge_Menu_Professor h7 = new Knowledge_Menu_Professor(R.mipmap.caomei, "草莓产业技术体系", null);
        Knowledge_Menu_Professor h8 = new Knowledge_Menu_Professor(R.mipmap.huahui, "花卉产业技术体系", null);
        Knowledge_Menu_Professor h9 = new Knowledge_Menu_Professor(R.mipmap.chaye, "茶叶产业技术体系", null);
        Knowledge_Menu_Professor h10 = new Knowledge_Menu_Professor(R.mipmap.shengzhu, "生猪产业技术体系", null);
        Knowledge_Menu_Professor h11 = new Knowledge_Menu_Professor(R.mipmap.rouyang, "肉羊产业技术体系", null);
        Knowledge_Menu_Professor h12 = new Knowledge_Menu_Professor(R.mipmap.roujichanye, "肉鸡产业技术体系", null);
        Knowledge_Menu_Professor h13 = new Knowledge_Menu_Professor(R.mipmap.danjichannye, "蛋鸡产业技术体系", null);
        Knowledge_Menu_Professor h14 = new Knowledge_Menu_Professor(R.mipmap.shuiqin, "水禽产业技术体系", null);
        Knowledge_Menu_Professor h15 = new Knowledge_Menu_Professor(R.mipmap.nainiu, "奶牛产业技术体系", null);

        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);
        list.add(h7);
        list.add(h8);
        list.add(h9);
        list.add(h10);
        list.add(h11);
        list.add(h12);
        list.add(h13);
        list.add(h14);
        list.add(h15);


        adapter = new Knowledge_Menu_ProfessorAdapter(this, list);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);


                startActivity(intent);
            }
        });

    }

    private void initView() {
        agricultural_expert_back_iv = (ImageView) findViewById(R.id.agricultural_expert_back_iv);
        knowledge_menu_professor_gv = (HomeMenuGridView) findViewById(R.id.knowledge_menu_professor_gv);
    }
}
