package com.green.pojo;

import java.util.Date;

public class ArticleThumbsup {
    private Integer id;

    private String articleId;

    private String userId;

    private Date thumbsupTime;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getThumbsupTime() {
        return thumbsupTime;
    }

    public void setThumbsupTime(Date thumbsupTime) {
        this.thumbsupTime = thumbsupTime;
    }
}