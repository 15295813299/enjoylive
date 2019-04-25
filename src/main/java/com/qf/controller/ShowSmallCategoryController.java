package com.qf.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.CategoryArticleDto;
import com.qf.service.ShowSmallCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowSmallCategoryController {
    @Autowired
    ShowSmallCategoryService showSmallCategoryService;


    /***
     *
     * @param
     * @return  返回restful 版块对应文章的JSON数据
     */
    @RequestMapping(value = "categoryArticleList",method = RequestMethod.POST)
    public Object categoryArticleList(@RequestBody(required = false) CategoryArticleDto categoryArticleDto){
        PageHelper.startPage(categoryArticleDto.getCurrentPage(),categoryArticleDto.getPageSize());
        List<CategoryArticleDto> categoryArticleDtos = showSmallCategoryService.categoryArticleList(categoryArticleDto);
        PageInfo pageInfo = new PageInfo(categoryArticleDtos);
        return pageInfo;
    }
}
