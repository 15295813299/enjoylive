package com.qf.service.impl;

import com.qf.dto.BrowselnfoListDto;
import com.qf.dto.HotListDto;
import com.qf.dto.NoneSupportCategory;
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

    @Override
    public List<Category> getBigCategoryList() {
        return categoryMapper.getBigCategoryList();
    }

    @Override
    public List<HotListDto> getHotCategory(String categoryName) {
        return categoryMapper.getHotCategory(categoryName);
    }

    @Override
    public List<BrowselnfoListDto> getBrowseCategory(String categoryName) {
        return categoryMapper.getBrowseCategory(categoryName);
    }

    @Override
    public NoneSupportCategory getNoneSupportCategory(String categoryName) {
        return categoryMapper.getNoneSupportCategory(categoryName);
    }

    @Override
    public NoneSupportCategory getArticleCountToCategory(String categoryName) {
        return categoryMapper.getArticleCountToCategory(categoryName);
    }


    /***
     *
     * @param userInfoId  用户ID
     * @return  该用户所有的文章
     */
    @Override
    public List<HotListDto> getUserInfoToShowArticle(Integer userInfoId) {
        return categoryMapper.getUserInfoToShowArticle(userInfoId);
    }

    @Override
    public List<BrowselnfoListDto> getCommentCategory(String categoryName) {
        return categoryMapper.getCommentCategory(categoryName);
    }
}
