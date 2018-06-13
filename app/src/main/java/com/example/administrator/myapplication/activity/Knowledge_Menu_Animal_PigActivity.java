package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Knowledge_Menu_Animal_PigAdapter;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.example.administrator.myapplication.moduels.Knowledge_Menu_Animal_Pig;
import com.example.administrator.myapplication.utils.ListViewForScrollView;

import java.util.ArrayList;
import java.util.List;

public class Knowledge_Menu_Animal_PigActivity extends AppCompatActivity {

    private List<Knowledge_Menu_Animal_Pig> list;
    private Knowledge_Menu_Animal_PigAdapter adapter;
    private ListViewForScrollView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge__menu__animal__pig);
        initData();

    }

    private void initData() {
        listView = (ListViewForScrollView) findViewById(R.id.knowledge_menu_animal_pig_lv);
        list = new ArrayList<>();
        Knowledge_Menu_Animal_Pig h1 = new Knowledge_Menu_Animal_Pig(R.mipmap.suzhongzhu,"苏钟猪", "2018-05-01", "阅读数：248", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=ee67e65d-d498-485c-9e98-eced9c009c69");
        Knowledge_Menu_Animal_Pig h2 = new Knowledge_Menu_Animal_Pig(R.mipmap.sushanzhu, "苏山猪", "2017-03-30", "阅读数：4263", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=265c4e27-e459-41d9-b26f-844f3a1dcc9f");
        Knowledge_Menu_Animal_Pig h3 = new Knowledge_Menu_Animal_Pig(R.mipmap.xinhuaizhu, "新淮猪", "2018-05-01", "阅读数：248", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=0569dfc3-a570-4c15-bf5a-230cbe8dcae4\n");
        Knowledge_Menu_Animal_Pig h4 = new Knowledge_Menu_Animal_Pig(R.mipmap.laohuaizhu, "老淮猪", "2017-03-30", "阅读数：4263", Home_Details.class,"http://njy.jsnjy.net.cn/web/share/new.action?newId=a048e77d-f235-46bb-9c93-87f45c396114");
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        adapter = new Knowledge_Menu_Animal_PigAdapter(this, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), list.get(position).getaClass());
                intent.putExtra("view",list.get(position).getNeturl());
                startActivity(intent);
            }
        });

    }
}