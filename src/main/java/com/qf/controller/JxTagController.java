package com.qf.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.service.JxITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sin
 * @date 2019/4/16/20:18
 */
@RestController
@RequestMapping("tag")
public class JxTagController {
    private final JxITagService jxITagService;

    @Autowired
    public JxTagController(JxITagService jxITagService) {
        this.jxITagService = jxITagService;
    }

    @RequestMapping("getPage")
    public Object getPage(@RequestParam int pageSize, @RequestParam int pageNum) {
        return jxITagService.getPage(pageNum, pageSize);
    }

    @RequestMapping("getArticleInfoIds")
    public Object getArticleInfoIds(@RequestParam String tagName,@RequestParam int pageNum) {
        Page<Integer> page = PageHelper.startPage(pageNum,10);
        String[] tagNames = tagName.split("_");
        for (int i = 0;i<tagNames.length;i++){
            tagNames[i] = "%" +tagNames[i]+"%";
        }
        jxITagService.getArticleInfoIds(tagNames);
        return new PageInfo<>(page);

    }
}
