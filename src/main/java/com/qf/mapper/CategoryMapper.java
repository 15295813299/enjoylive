package com.qf.mapper;

import com.qf.pojo.Category;

import java.util.List;

public interface CategoryMapper {

    /**
     * 获取文章类型中的子类（parentId ！= 0）
     * @return 文章类型的子类集合
     */
    public List<Category> getCategoryIdList();
}
