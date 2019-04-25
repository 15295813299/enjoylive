package com.qf.vo;


public class JcpSupport {

  private Integer supportId;
  private Integer userInfoId;
  private Integer articleId;
  private Integer supportCount;
  private String flag;

  @Override
  public String toString() {
    return "JcpSupport{" +
            "supportId=" + supportId +
            ", userInfoId=" + userInfoId +
            ", articleId=" + articleId +
            ", supportCount=" + supportCount +
            ", flag='" + flag + '\'' +
            '}';
  }

  public Integer getSupportId() {
    return supportId;
  }

  public void setSupportId(Integer supportId) {
    this.supportId = supportId;
  }

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

  public Integer getSupportCount() {
    return supportCount;
  }

  public void setSupportCount(Integer supportCount) {
    this.supportCount = supportCount;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

}
