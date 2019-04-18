package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.CategoryInfoDto;
import com.qf.service.CategoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryInfoController {
    @Autowired
    CategoryInfoService categoryInfoService;

    @RequestMapping(value = "getCategoryInfo",method = RequestMethod.POST)
    public Object getCategoryInfo(@RequestBody CategoryInfoDto categoryInfoDto){
        System.out.println(categoryInfoDto);
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
}
