package com.qf.controller;

import com.qf.dto.MzhArticleInfoDto;
import com.qf.service.MzhArticleInfoService;
import com.qf.tools.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class MzhArticleInfoController {
    @Autowired
    MzhArticleInfoService mzhArticleInfoService;

    @RequestMapping(value = "getArticleByCid", method = RequestMethod.POST)
    public Object getArticleByCid(@RequestParam int categoryId) {
        System.out.println(categoryId);
        List<MzhArticleInfoDto> articleByCid = mzhArticleInfoService.getArticleByCid(categoryId);
        System.out.println(articleByCid);
        return articleByCid;
    }
    @RequestMapping(value = "getArticle", method = RequestMethod.POST)
    public Object getArticle(@RequestParam int articleId, HttpServletRequest request) {
        System.out.println(articleId);
        String ipAddress = IpUtil.getIpAddress(request);
        System.out.println(ipAddress);
        MzhArticleInfoDto article = mzhArticleInfoService.getArticle(articleId);
        System.out.println(article);
        return article;
    }
}
