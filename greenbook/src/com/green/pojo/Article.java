package com.green.pojo;

import java.util.Date;

public class Article {
    private Integer id;

    private String articleId;

    private String articleTitle;

    private Date atticleCraeteTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Date getAtticleCraeteTime() {
        return atticleCraeteTime;
    }

    public void setAtticleCraeteTime(Date atticleCraeteTime) {
        this.atticleCraeteTime = atticleCraeteTime;
    }
}