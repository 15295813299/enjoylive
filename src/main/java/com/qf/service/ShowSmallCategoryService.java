package com.qf.service;

import com.qf.dto.CategoryArticleDto;

import java.util.List;

public interface ShowSmallCategoryService {
    List<CategoryArticleDto> categoryArticleList(CategoryArticleDto categoryArticleDto);
}
