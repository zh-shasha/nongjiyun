package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Knowledge_Menu_Animal_PigAdapter;
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
        Knowledge_Menu_Animal_Pig h1 = new Knowledge_Menu_Animal_Pig(R.mipmap.ic_launcher, "苏钟猪", "2018-05-01", "阅读数：248", Knowledge_Menu_Animal_Pig_DetailActivity.class);
        Knowledge_Menu_Animal_Pig h2 = new Knowledge_Menu_Animal_Pig(R.mipmap.ic_launcher, "苏山猪", "2017-03-30", "阅读数：4263", Knowledge_Menu_Animal_Pig_DetailActivity.class);
        Knowledge_Menu_Animal_Pig h3 = new Knowledge_Menu_Animal_Pig(R.mipmap.ic_launcher, "新准猪", "2018-05-01", "阅读数：248", Knowledge_Menu_Animal_Pig_DetailActivity.class);
        Knowledge_Menu_Animal_Pig h4 = new Knowledge_Menu_Animal_Pig(R.mipmap.ic_launcher, "老准猪", "2017-03-30", "阅读数：4263", Knowledge_Menu_Animal_Pig_DetailActivity.class);


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
                startActivity(intent);
            }
        });

    }
}