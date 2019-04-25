package com.qf.dto;

import java.io.Serializable;

public class CategoryArticleDto {
    private Integer articleId;
    private Integer userInfoId;
    private Integer categoryId;
    private String title;
    private String content;
    private String articleInfoDate;
    private String potoPath="img/bk_img/defaultImg.jpg";
    private String categoryName;
    private String name;
    //当前页
    private int currentPage;
    //每一页显示条数
    private int pageSize;

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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleInfoDate() {
        return articleInfoDate;
    }

    public void setArticleInfoDate(String articleInfoDate) {
        this.articleInfoDate = articleInfoDate;
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

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "CategoryArticleDto{" +
                "articleId=" + articleId +
                ", userInfoId=" + userInfoId +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", articleInfoDate='" + articleInfoDate + '\'' +
                ", potoPath='" + potoPath + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", name='" + name + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}



