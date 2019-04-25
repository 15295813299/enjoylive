package com.qf.pojo;


public class CommentInfo {

  private long commentId;
  private long userInfoId;
  private long articleId;
  private String message;
  private String commentDate;
  //评论者账户昵称
  private String name;
  private String headPath;


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public String getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(String commentDate) {
    this.commentDate = commentDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHeadPath() {
    return headPath;
  }

  public void setHeadPath(String headPath) {
    this.headPath = headPath;
  }

  @Override
  public String toString() {
    return "CommentInfo{" +
            "commentId=" + commentId +
            ", userInfoId=" + userInfoId +
            ", articleId=" + articleId +
            ", message='" + message + '\'' +
            ", commentDate=" + commentDate +
            ", name='" + name + '\'' +
            ", headPath='" + headPath + '\'' +
            '}';
  }
}
