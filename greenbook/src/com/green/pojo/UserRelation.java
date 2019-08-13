package com.green.pojo;

public class UserRelation {
    private Integer id;

    private String userId;

    private String interestId;

    private String followerId;

    private String historyProductId;

    private String historyArticleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getInterestId() {
        return interestId;
    }

    public void setInterestId(String interestId) {
        this.interestId = interestId == null ? null : interestId.trim();
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId == null ? null : followerId.trim();
    }

    public String getHistoryProductId() {
        return historyProductId;
    }

    public void setHistoryProductId(String historyProductId) {
        this.historyProductId = historyProductId == null ? null : historyProductId.trim();
    }

    public String getHistoryArticleId() {
        return historyArticleId;
    }

    public void setHistoryArticleId(String historyArticleId) {
        this.historyArticleId = historyArticleId == null ? null : historyArticleId.trim();
    }
}