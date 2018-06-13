package com.example.administrator.myapplication.moduels;

public class Knowledge_Menu_Animal_Pig {
    private int img;
    private String title;
    private String date;
    private String readnum;
    private Class aClass;
    private String neturl;


    public Knowledge_Menu_Animal_Pig(int img, String title, String date, String readnum, Class aClass,String neturl){
        this.img=img;
        this.title=title;
        this.date=date;
        this.readnum=readnum;
        this.aClass=aClass;
        this.neturl=neturl;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
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

    public String getReadnum() {
        return readnum;
    }

    public void setReadnum(String readnum) {
        this.readnum = readnum;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public String getNeturl() {
        return neturl;
    }

    public void setNeturl(String neturl) {
        this.neturl = neturl;
    }
}
