package com.qf.service;

import com.qf.pojo.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 获取文章类型中的子类（parentId ！= 0）
     * @return 文章类型的子类集合
     */
    public List<Category> getCategoryIdList();
}
