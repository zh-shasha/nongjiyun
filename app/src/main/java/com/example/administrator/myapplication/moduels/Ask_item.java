package com.example.administrator.myapplication.moduels;

public class Ask_item {
    private int head_img;
    private String name;
    private String local;
    private String identity;
    private String expert_type;
    private String article;
    private int article_img;
    private int article_img2;
    private int article_img3;
    private String date;
    private String response;
    private Class aClass;
    public Ask_item(int head_img, String name, String local, String expert_type,String identity,
                    String article, int article_img, int article_img2, int article_img3, String date,String response, Class aClass){
        this.head_img=head_img;
        this.name=name;
        this.local=local;
        this.identity=identity;
        this.expert_type=expert_type;
        this.article=article;
        this.article_img=article_img;
        this.article_img2=article_img2;
        this.article_img3=article_img3;
        this.date=date;
        this.response=response;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getExpert_type() {
        return expert_type;
    }

    public void setExpert_type(String expert_type) {
        this.expert_type = expert_type;
    }
}
