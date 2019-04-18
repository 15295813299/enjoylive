package com.qf.service;

import com.qf.dto.CategoryInfoDto;

import java.util.List;

public interface CategoryInfoService {
    List<CategoryInfoDto> getCategoryInfo(CategoryInfoDto categoryInfoDto);
    List<CategoryInfoDto> getHeaderCategoryInfo();
}
