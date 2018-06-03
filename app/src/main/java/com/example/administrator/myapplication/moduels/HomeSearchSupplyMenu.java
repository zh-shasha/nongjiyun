package com.example.administrator.myapplication.moduels;

/**
 * Created by Administrator on 2018/6/3.
 */

public class HomeSearchSupplyMenu  {
    private int image1;
    private String title;
    private String content;
    private String tip;
    private int image2;
    private String adress;
    private String date;
    private Class url;
     public  HomeSearchSupplyMenu(int image1,String title,String content,String tip,int image2,
                                 String adress,String date,Class url){
         this.image1=image1;
         this.title=title;
         this.content=content;
         this.tip=tip;
         this.image2=image2;
         this.adress=adress;
         this.date=date;
         this.url=url;


     }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Class getUrl() {
        return url;
    }

    public void setUrl(Class url) {
        this.url = url;
    }
}

