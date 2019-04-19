package com.qf.service;

import com.qf.pojo.ArticleInfo;

import java.util.Map;

public interface ArticleInfoService {

    public void addArticle(ArticleInfo articleInfo);

    public Integer addArticlePoto(Map<String, Object> map);
}
