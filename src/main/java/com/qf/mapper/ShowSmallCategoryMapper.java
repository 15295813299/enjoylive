package com.qf.mapper;

import com.qf.dto.CategoryArticleDto;

import java.util.List;

public interface ShowSmallCategoryMapper {
    List<CategoryArticleDto> categoryArticleList(CategoryArticleDto categoryArticleDto);
}
