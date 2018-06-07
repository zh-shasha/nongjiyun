package com.example.administrator.myapplication.moduels;

/**
 * Created by Administrator on 2018/6/7.
 */

public class HomeWantToBuyMenu {
  private String titie;
  private String context;
  private int image;
  private String city;
  private String top;
  private String Date;
  public HomeWantToBuyMenu(String titie,String context,int image,String city,
                           String top,String Date){
      this.titie=titie;
      this.context=context;
      this.image=image;
      this.city=city;
      this.top=top;
      this.Date=Date;
  }

    public String getTitie() {
        return titie;
    }

    public void setTitie(String titie) {
        this.titie = titie;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
