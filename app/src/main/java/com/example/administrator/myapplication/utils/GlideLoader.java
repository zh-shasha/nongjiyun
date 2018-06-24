package com.example.administrator.myapplication.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.administrator.myapplication.R;
import com.jaiky.imagespickers.ImageLoader;

public class GlideLoader implements ImageLoader {
    private static RequestOptions options = new RequestOptions();

	private static final long serialVersionUID = 1L;

	@Override
    public void displayImage(Context context, String path, ImageView imageView) {
        options.placeholder(R.drawable.global_img_default).centerCrop();
        Glide.with(context)
                .load(path)
                .apply(options)
                .into(imageView);
    }

}
