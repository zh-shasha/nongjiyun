package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.Knowledge_Menu_TecAdapter;
import com.example.administrator.myapplication.moduels.Knowledge_Menu_Tec;

import java.util.ArrayList;
import java.util.List;

public class Knowledge_Menu_TecActivity extends AppCompatActivity {
    private List<Knowledge_Menu_Tec> list;
    private ListView listView;
    private Knowledge_Menu_TecAdapter adapter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_menu__tec);
        initData();
        button=findViewById(R.id.knowledge_menu_te_bt);//返回上一个activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initData() {
        listView=(ListView) findViewById(R.id.knowledge_menu_tec_lv);
        list=new ArrayList<Knowledge_Menu_Tec>();
        Knowledge_Menu_Tec h1=new Knowledge_Menu_Tec("猪流行性腹泻的防控与治疗措施","2018-05-01","阅读数：248",Knowledge_Menu_Animal_Pig_DetailActivity.class);
        Knowledge_Menu_Tec h2=new Knowledge_Menu_Tec("食用菌基质循环利用技术","2017-03-30","阅读数：4263",Knowledge_Menu_Animal_Pig_DetailActivity.class);


        list.add(h1);
        list.add(h2);
        adapter = new Knowledge_Menu_TecAdapter(getApplicationContext(),list);
        listView.setAdapter(adapter);
        listView.setBackgroundColor(Color.WHITE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),list.get(position).getaClass());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
            }
        });

    }
}
