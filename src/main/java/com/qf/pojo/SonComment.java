package com.qf.pojo;


public class SonComment {

  private long sonCommentId;
  //所属文章id
  private long articleId;
  //评论者id
  private long userInfoId;
  //被评论人
  private long receiverId;
  private String message;
  private String sonCommentTime;
  //所属父评论id
  private long commentId;
  private String flag;
  //评论人姓名
  private String Username;
  //被回复人姓名
  private String receiverName;
  private String headPath;



  public long getSonCommentId() {
    return sonCommentId;
  }

  public void setSonCommentId(long sonCommentId) {
    this.sonCommentId = sonCommentId;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(long receiverId) {
    this.receiverId = receiverId;
  }

  public String getSonCommentTime() {
    return sonCommentTime;
  }

  public void setSonCommentTime(String sonCommentTime) {
    this.sonCommentTime = sonCommentTime;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String username) {
    Username = username;
  }

  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }

  public String getHeadPath() {
    return headPath;
  }

  public void setHeadPath(String headPath) {
    this.headPath = headPath;
  }


  @Override
  public String toString() {
    return "SonComment{" +
            "sonCommentId=" + sonCommentId +
            ", articleId=" + articleId +
            ", userInfoId=" + userInfoId +
            ", receiverId=" + receiverId +
            ", message='" + message + '\'' +
            ", sonCommentTime=" + sonCommentTime +
            ", commentId=" + commentId +
            ", flag='" + flag + '\'' +
            ", Username='" + Username + '\'' +
            ", receiverName='" + receiverName + '\'' +
            ", headPath='" + headPath + '\'' +
            '}';
  }
}
