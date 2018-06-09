package com.example.administrator.myapplication.moduels;

public class HomeSearchTabAnswerMenu {
    private int head_img;
    private String name;
    private String local;
    private String identity;
    private String article;
    private int article_img;
    private int article_img2;
    private int article_img3;
    private String tv_adress;
    private String date;
    private String detail;
    private String already_answer;
    private Class aClass;
    public HomeSearchTabAnswerMenu(int head_img, String name, String local, String identity,
                                   String article, int article_img, int article_img2, int article_img3, String tv_adress, String date, String detail , String already_answer, Class aClass){
        this.head_img=head_img;
        this.name=name;
        this.local=local;
        this.identity=identity;
        this.article=article;
        this.article_img=article_img;
        this.article_img2=article_img2;
        this.article_img3=article_img3;
        this.tv_adress=tv_adress;
        this.date=date;
        this.detail=detail;
        this.already_answer=already_answer;
        this.aClass=aClass;
    }

    public int getHead_img() {
        return head_img;
    }

    public void setHead_img(int head_img) {
        this.head_img = head_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getArticle_img() {
        return article_img;
    }

    public void setArticle_img(int article_img) {
        this.article_img = article_img;
    }

    public int getArticle_img2() {
        return article_img2;
    }

    public void setArticle_img2(int article_img2) {
        this.article_img2 = article_img2;
    }

    public int getArticle_img3() {
        return article_img3;
    }

    public void setArticle_img3(int article_img3) {
        this.article_img3 = article_img3;
    }


    public String getTv_adress() {
        return tv_adress;
    }

    public void setTv_adress(String tv_adress) {
        this.tv_adress = tv_adress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAlready_answer() {
        return already_answer;
    }

    public void setAlready_answer(String already_answer) {
        this.already_answer = already_answer;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }



}
