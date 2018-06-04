package com.example.administrator.myapplication.moduels;

/**
 * Created by Administrator on 2018/6/4.
 */

public class HomeAddFriendsListMenu {

    private int image;
    private String name;
    private String type;
    private int image_into;
    private Class url;
    public HomeAddFriendsListMenu(int image,String name,String type,int image_into,Class url){
        this.image=image;
        this.name=name;
        this.type=type;
        this.image_into=image_into;
        this.url=url;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage_into() {
        return image_into;
    }

    public void setImage_into(int image_into) {
        this.image_into = image_into;
    }

    public Class getUrl() {
        return url;
    }

    public void setUrl(Class url) {
        this.url = url;
    }
}

