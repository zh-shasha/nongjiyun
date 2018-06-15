package com.example.administrator.myapplication.moduels;

/**
 * Created by Administrator on 2018/5/4.
 */

public class Home_TimeFarmingMenu {
    private String title;
    private String date;
    private  String reader;
    private int image;

    private String tv_top;
    private String tv_push;
    private Class url;
    private String neturl;

    public Home_TimeFarmingMenu(String title, String date, String reader, int image, String tv_top, String tv_push, Class url,  String neturl) {
        this.title = title;
        this.date = date;
        this.reader = reader;
        this.image = image;
        this.tv_top = tv_top;
        this.tv_push = tv_push;
        this.url = url;

        this.neturl = neturl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getTv_top() {
        return tv_top;
    }

    public void setTv_top(String tv_top) {
        this.tv_top = tv_top;
    }

    public String getTv_push() {
        return tv_push;
    }

    public void setTv_push(String tv_push) {
        this.tv_push = tv_push;
    }

    public Class getUrl() {
        return url;
    }

    public void setUrl(Class url) {
        this.url = url;
    }

    public String getNeturl() {
        return neturl;
    }

    public void setNeturl(String neturl) {
        this.neturl = neturl;
    }


}
