package com.qf.mapper;

import com.qf.pojo.ArticleInfo;

import java.util.Map;

public interface ArticleInfoMapper {

    public void addArticle(ArticleInfo articleInfo);

    public Integer addArticlePoto(Map<String, Object> map);
}
