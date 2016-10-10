package com.mr.bean;

import java.util.Date;

/**
 * Created by gaohailong on 2016/9/13.
 */
public class Title {
    private int id;
    private String title;
    private String content;
    private String tag;
    private Date date;
    private String plink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlink() {
        return plink;
    }

    public void setPlink(String plink) {
        this.plink = plink;
    }
}
