package com.example.administrator.myapplication.moduels;

/**
 * Created by Administrator on 2018/6/4.
 */

public class HomeScienceTechnologyItemHenu {
   private int image;
   private Class url;
public HomeScienceTechnologyItemHenu(int image,Class url){
    this.image=image;
    this.url=url;
}

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Class getUrl() {
        return url;
    }

    public void setUrl(Class url) {
        this.url = url;
    }
}

