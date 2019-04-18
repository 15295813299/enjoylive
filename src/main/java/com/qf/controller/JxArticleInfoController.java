package com.qf.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.service.JxIArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/17/10:35
 */
@RestController
@RequestMapping("article")
public class JxArticleInfoController {
    private final JxIArticleService jxIArticleService;

    @Autowired
    public JxArticleInfoController(JxIArticleService jxIArticleService) {
        this.jxIArticleService = jxIArticleService;
    }

    @RequestMapping("getArticleInfoByIds")
    public Object getArticleInfoByIds(@RequestParam int[] ids) {
        List<Map> list = new ArrayList<>();
        for (int id : ids) {
            Map map = jxIArticleService.getInfoMap(id);
            list.add(map);
        }
        return list;
    }

    @RequestMapping("getArticleIdByCategoryName")
    public Object getArticleIdByCategoryName(@RequestParam String categoryName,@RequestParam int pageNum,@RequestParam int pageSize) {
        Page<Integer> page = PageHelper.startPage(pageNum,pageSize);
        jxIArticleService.getArticleIdByCategoryName(categoryName);
        return new PageInfo<>(page);
    }

    @RequestMapping("getIdBySupport")
    public Object getIdBySupport()
    {
        Page<Integer> page = PageHelper.startPage(0,10);
        jxIArticleService.getIdBySupport();
        return new PageInfo<>(page);
    }

    @RequestMapping("getIdByBrowse")
    public Object getIdByBrowse() {

        Page<Integer> page = PageHelper.startPage(0,10);
        jxIArticleService.getIdByBrowse();
        return new PageInfo<>(page);
    }

    @RequestMapping("getIdByComment")
    public Object getIdByComment() {
        Page<Integer> page = PageHelper.startPage(0,10);
        jxIArticleService.getIdByComment();
        return new PageInfo<>(page);
    }

    @RequestMapping("getIdByTime")
    public Object getIdByTime() {
        Page<Integer> page = PageHelper.startPage(0,10);
        jxIArticleService.getIdByTime();
        return new PageInfo<>(page);
    }

    @RequestMapping("getIdByTimestamp")
    public Object getIdByTimestamp(@RequestParam int dayBefore, @RequestParam int pageNum, @RequestParam int pageSize) {
        Page<Integer> page = PageHelper.startPage(pageNum, pageSize);
        jxIArticleService.getIdByTimestamp(dayBefore);
        return new PageInfo<>(page);
    }

    @RequestMapping("getIdByTitleDim")
    public Object getIdByTitleDim(@RequestParam String text, @RequestParam int pageNum, @RequestParam int pageSize) {
        //查看查询条件是否在热门标签表,如果在则其次数加一,不在则创建
        jxIArticleService.checkHotTag(text);
        text = "%" + text + "%";
        Page<Integer> page = PageHelper.startPage(pageNum, pageSize);
        jxIArticleService.getIdByTitleDim(text);
        return new PageInfo<>(page);
    }
}
