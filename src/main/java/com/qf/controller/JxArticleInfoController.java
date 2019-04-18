package com.qf.controller;

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
    public Object getArticleIdByCategoryName(@RequestParam String categoryName) {
        return jxIArticleService.getArticleIdByCategoryName(categoryName);
    }

    @RequestMapping("getIdBySupport")
    public Object getIdBySupport() {
        return jxIArticleService.getIdBySupport();
    }

    @RequestMapping("getIdByBrowse")
    public Object getIdByBrowse() {
        return jxIArticleService.getIdByBrowse();
    }

    @RequestMapping("getIdByComment")
    public Object getIdByComment() {
        return jxIArticleService.getIdByComment();
    }

    @RequestMapping("getIdByTime")
    public Object getIdByTime() {
        return jxIArticleService.getIdByTime();
    }

    @RequestMapping("getIdByTimestamp")
    public Object getIdByTimestamp(@RequestParam int dayBefore) {
        return jxIArticleService.getIdByTimestamp(dayBefore);
    }

    @RequestMapping("getIdByTitleDim")
    public Object getIdByTitleDim(@RequestParam String text) {
        //查看查询条件是否在热门标签表,如果在则其次数加一,不在则创建
        jxIArticleService.checkHotTag(text);
        text = "%" + text + "%";
        return jxIArticleService.getIdByTitleDim(text);
    }
}
