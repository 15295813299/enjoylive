package com.qf.pojo;

public class LevelInfo {
    private long lvId;
    private long lvScore;
    private long userInfoId;
    private String username;

    public long getLvId() {
        return lvId;
    }

    public void setLvId(long lvId) {
        this.lvId = lvId;
    }

    public long getLvScore() {
        return lvScore;
    }

    public void setLvScore(long lvScore) {
        this.lvScore = lvScore;
    }

    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LevelInfo{" +
                "lvId=" + lvId +
                ", lvScore=" + lvScore +
                ", userInfoId=" + userInfoId +
                '}';
    }
}
