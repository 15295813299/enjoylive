package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.CategoryInfoDto;
import com.qf.service.CategoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryInfoController {
    @Autowired
    CategoryInfoService categoryInfoService;

    @RequestMapping(value = "getCategoryInfo",method = RequestMethod.POST)
    public Object getCategoryInfo(@RequestBody CategoryInfoDto categoryInfoDto){
        PageHelper.startPage(categoryInfoDto.getCurrentPage(),categoryInfoDto.getPageSize());
        List<CategoryInfoDto> categoryInfo = categoryInfoService.getCategoryInfo(categoryInfoDto);
        PageInfo pageInfo= new PageInfo(categoryInfo);
        return pageInfo;
    }
    @RequestMapping(value = "getHeaderCategoryInfo",method = RequestMethod.POST)
    public Object getHeaderCategoryInfo(){
        List<CategoryInfoDto> headerCategoryInfo = categoryInfoService.getHeaderCategoryInfo();
        return headerCategoryInfo;
    }

    @RequestMapping(value ="getCountCategoryArticle",method = RequestMethod.POST)
    public Integer getCountCategoryArticle(@RequestParam Integer categoryId){
        Integer countCategoryArticle = categoryInfoService.getCountCategoryArticle(categoryId);
        return countCategoryArticle;
    }
}
