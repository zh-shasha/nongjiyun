package com.example.administrator.myapplication.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.administrator.myapplication.R;

public class Knowledge_Menu_Animal_Pig_DetailActivity extends AppCompatActivity {
    private Button button;
    private RadioButton rb;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge__menu__animal__pig__detail);

        button = findViewById(R.id.knowledge_menu_animal_pig_detail_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rb = findViewById(R.id.knowledge_menu_animal_pig_detail_collection);
        rb.setText("收藏");
        rb.setButtonDrawable(null);
        rb.setTextColor(Color.WHITE);
        rb.setGravity(Gravity.CENTER);
        radioButton = findViewById(R.id.knowledge_menu_animal_pig_detail_share);
        radioButton.setText("分享");
        radioButton.setButtonDrawable(null);
        radioButton.setTextColor(Color.WHITE);
        radioButton.setGravity(Gravity.CENTER);
    }
}
