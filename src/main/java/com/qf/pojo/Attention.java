package com.qf.pojo;


public class Attention {

  private long attentionId;
  //用户id
  private long userInfoId;
  //被关注者id
  private long authorId;
  private long flag;


  public long getAttentionId() {
    return attentionId;
  }

  public void setAttentionId(long attentionId) {
    this.attentionId = attentionId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }


  public long getFlag() {
    return flag;
  }

  public void setFlag(long flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "Attention{" +
            "attentionId=" + attentionId +
            ", userInfoId=" + userInfoId +
            ", authorId=" + authorId +
            ", flag=" + flag +
            '}';
  }
}
