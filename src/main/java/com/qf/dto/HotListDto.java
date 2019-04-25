package com.qf.dto;

import lombok.Data;


public class HotListDto {
    private String categoryPoto;
    private String categoryLogo;
    private Integer parentId;
    private Integer supportId;
    private Integer articleId;
    private Integer supportCount;
    private Integer count;
    private Integer userInfoId;
    private Integer categoryId;
    private String title;
    private String content;
    private String articleInfoDate;
    private String categoryName;
    private String Bigname;
    private String name;
    private String potoPath;

    public String getCategoryPoto() {
        return categoryPoto;
    }

    public void setCategoryPoto(String categoryPoto) {
        this.categoryPoto = categoryPoto;
    }

    public String getCategoryLogo() {
        return categoryLogo;
    }

    public void setCategoryLogo(String categoryLogo) {
        this.categoryLogo = categoryLogo;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSupportId() {
        return supportId;
    }

    public void setSupportId(Integer supportId) {
        this.supportId = supportId;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBigname() {
        return Bigname;
    }

    public void setBigname(String bigname) {
        Bigname = bigname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPotoPath() {
        return potoPath;
    }

    public void setPotoPath(String potoPath) {
        this.potoPath = potoPath;
    }

    @Override
    public String toString() {
        return "HotListDto{" +
                "categoryPoto='" + categoryPoto + '\'' +
                ", categoryLogo='" + categoryLogo + '\'' +
                ", parentId=" + parentId +
                ", supportId=" + supportId +
                ", articleId=" + articleId +
                ", supportCount=" + supportCount +
                ", count=" + count +
                ", userInfoId=" + userInfoId +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", articleInfoDate='" + articleInfoDate + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", Bigname='" + Bigname + '\'' +
                ", name='" + name + '\'' +
                ", potoPath='" + potoPath + '\'' +
                '}';
    }
}
