package com.qf.dto;

import java.util.List;

public class CategoryInfoDto {
    private int categoryId;
    private String categoryName;
    private String categoryPoto;
    private String categoryLogo;
    private int parentId;
    private String flag;
    //当前页
    private int currentPage;
    //每一页显示条数
    private int pageSize;
    List<CategoryInfoDto> childCategoryInfo;


    public List<CategoryInfoDto> getChildCategoryInfo() {
        return childCategoryInfo;
    }

    public void setChildCategoryInfo(List<CategoryInfoDto> childCategoryInfo) {
        this.childCategoryInfo = childCategoryInfo;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

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

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
        return "CategoryInfoDto{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryPoto='" + categoryPoto + '\'' +
                ", categoryLogo='" + categoryLogo + '\'' +
                ", parentId=" + parentId +
                ", flag='" + flag + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", childCategoryInfo=" + childCategoryInfo +
                '}';
    }
}
