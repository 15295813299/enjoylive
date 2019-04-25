package com.qf.vo;

public class ViolateVo {
    private Integer userInfoId;
    private Integer articleId;
    private Integer reportToUserId;
    private String violateContent;
    private String violateHref;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getReportToUserId() {
        return reportToUserId;
    }

    public void setReportToUserId(Integer reportToUserId) {
        this.reportToUserId = reportToUserId;
    }

    public String getViolateContent() {
        return violateContent;
    }

    public void setViolateContent(String violateContent) {
        this.violateContent = violateContent;
    }

    public String getViolateHref() {
        return violateHref;
    }

    public void setViolateHref(String violateHref) {
        this.violateHref = violateHref;
    }

    @Override
    public String toString() {
        return "ViolateVo{" +
                "userInfoId=" + userInfoId +
                ", articleId=" + articleId +
                ", reportToUserId=" + reportToUserId +
                ", violateContent='" + violateContent + '\'' +
                ", violateHref='" + violateHref + '\'' +
                '}';
    }
}
