package com.example.administrator.myapplication.moduels;

public class BecomeRich {
    private int image;
    private String title;
    private String num;
    private String type;
    private String top;

    public BecomeRich() {
    }

    public BecomeRich(int image, String title,
                      String num, String type, String top) {
        this.image = image;
        this.title = title;
        this.num = num;
        this.type = type;
        this.top = top;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
