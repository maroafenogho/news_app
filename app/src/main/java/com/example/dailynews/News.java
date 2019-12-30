package com.example.dailynews;

public class News {

    private String mName;
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mAuthorName;

    public  News(String name, String title, String date, String url, String authorName) {
        mName = name;
        mTitle = title;
        mDate = date;
        mUrl = url;
        mAuthorName = authorName;

    }

    public String getName() {
        return mName;
    }

    public String getTitle() { return  mTitle;}

    public String getDate() {
        return mDate;
    }

    public String getUrl() {return  mUrl;}

    public  String getAuthorName() {return  mAuthorName;}


}