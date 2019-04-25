package com.qf.service.impl;

import com.qf.dto.CategoryArticleDto;
import com.qf.mapper.ShowSmallCategoryMapper;
import com.qf.service.ShowSmallCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowSmallCategoryServiceImp implements ShowSmallCategoryService {
    @Autowired
    ShowSmallCategoryMapper showSmallCategoryMapper;

    public List<CategoryArticleDto> categoryArticleList(CategoryArticleDto categoryArticleDto) {
        return showSmallCategoryMapper.categoryArticleList(categoryArticleDto);
    }
}
