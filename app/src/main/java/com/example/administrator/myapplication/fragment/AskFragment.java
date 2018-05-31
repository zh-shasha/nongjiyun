package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.QuickQuestionSubmission;

/**
 * A simple {@link Fragment} subclass.
 */
public class AskFragment extends Fragment {

private Button quick_ask_bt;
    public AskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ask, container, false);
        initView(view);
        init();
        return view;
    }

    private void init() {
        quick_ask_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), QuickQuestionSubmission.class);
                startActivity(intent);
            }
        });
    }

    private void initView(View view) {

        quick_ask_bt=(Button)view.findViewById(R.id.quick_ask_bt);
    }

}
