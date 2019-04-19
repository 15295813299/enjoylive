package com.qf.controller;

import com.qf.pojo.Category;
import com.qf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @RequestMapping(value = "getCategoryIdList", method = RequestMethod.GET)
    public List<Category> getCategoryIdList() {
       return categoryService.getCategoryIdList();
    }

}
