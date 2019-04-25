package com.qf.service.impl;

import com.qf.dto.CategoryInfoDto;
import com.qf.mapper.CategoryInfoMapper;
import com.qf.service.CategoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryInfoServiceImp implements CategoryInfoService {
    @Autowired
   CategoryInfoMapper categoryInfoMapper;

    public List<CategoryInfoDto> getCategoryInfo(CategoryInfoDto categoryInfoDto) {
        return categoryInfoMapper.getCategoryInfo(categoryInfoDto);
    }

    public List<CategoryInfoDto> getHeaderCategoryInfo() {
        return categoryInfoMapper.getHeaderCategoryInfo();
    }

    public Integer getCountCategoryArticle(Integer id) {
        return categoryInfoMapper.getCountCategoryArticle(id);
    }
}
