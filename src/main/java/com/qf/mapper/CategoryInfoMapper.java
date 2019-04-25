package com.qf.mapper;

import com.qf.dto.CategoryInfoDto;

import java.util.List;

public interface CategoryInfoMapper {
   List<CategoryInfoDto> getCategoryInfo(CategoryInfoDto categoryInfoDto);
   List<CategoryInfoDto> getHeaderCategoryInfo();
   Integer getCountCategoryArticle(Integer id);
}
