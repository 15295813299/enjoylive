package com.qf.service.impl;

import com.qf.mapper.CategoryMapper;
import com.qf.pojo.Category;
import com.qf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    /**
     * 获取文章类型中的子类（parentId ！= 0）
     * @return 文章类型的子类集合
     */
    public List<Category> getCategoryIdList() {
        return categoryMapper.getCategoryIdList();
    }
}
