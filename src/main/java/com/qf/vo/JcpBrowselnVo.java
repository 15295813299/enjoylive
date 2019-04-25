package com.qf.vo;

public class JcpBrowselnVo {
    private Integer browseInfoId;
    private Integer articleId;
    private Integer userInfoId;
    private Integer browseCount;
    private String flag;


    public Integer getBrowseInfoId() {
        return browseInfoId;
    }

    public void setBrowseInfoId(Integer browseInfoId) {
        this.browseInfoId = browseInfoId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "JcpBrowselnVo{" +
                "browseInfoId=" + browseInfoId +
                ", articleId=" + articleId +
                ", userInfoId=" + userInfoId +
                ", browseCount=" + browseCount +
                ", flag='" + flag + '\'' +
                '}';
    }
}
