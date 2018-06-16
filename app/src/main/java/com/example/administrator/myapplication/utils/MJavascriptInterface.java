package com.example.administrator.myapplication.utils;

import android.content.Context;
import android.content.Intent;

import com.example.administrator.myapplication.activity.PhotoBrowserActivity;

/**
 * Created by Administrator on 2018/6/16.
 */

public class MJavascriptInterface {
    private Context context;
    private String [] imageUrls;

    public MJavascriptInterface(Context context,String[] imageUrls) {
        this.context = context;
        this.imageUrls = imageUrls;
    }

    @android.webkit.JavascriptInterface
    public void openImage(String img) {
        Intent intent = new Intent();
        intent.putExtra("imageUrls", imageUrls);
        intent.putExtra("curImageUrl", img);
        intent.setClass(context, PhotoBrowserActivity.class);
        context.startActivity(intent);
    }
}
