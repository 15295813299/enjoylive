package com.qf.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;
import java.util.List;
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class MzhArticleInfoDto {
    private String username;
    private String title;
    private String potoPath;
    private String categoryName;
    private int articleId;
    private int userInfoId;
    private int categoryId;
    private String flag;
    private String content;
    private String articleInfoDate;
    private int parentId;
    private String name;

    @Override
    public String toString() {
        return "MzhArticleInfoDto{" +
                "username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", potoPath='" + potoPath + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", articleId=" + articleId +
                ", userInfoId=" + userInfoId +
                ", categoryId=" + categoryId +
                ", flag='" + flag + '\'' +
                ", content='" + content + '\'' +
                ", articleInfoDate='" + articleInfoDate + '\'' +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleInfoDate() {
        return articleInfoDate.substring(0,articleInfoDate.length()-2);
    }

    public void setArticleInfoDate(String articleInfoDate) {
        this.articleInfoDate = articleInfoDate;
    }

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }



    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPotoPath() {
        return potoPath;
    }

    public void setPotoPath(String potoPath) {
        this.potoPath = potoPath;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
