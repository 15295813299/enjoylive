package com.qf.service.impl;

import com.qf.mapper.ArticleInfoMapper;
import com.qf.pojo.ArticleInfo;
import com.qf.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService {

    @Autowired
    ArticleInfoMapper articleInfoMapper;

    public void addArticle(ArticleInfo articleInfo) {
        articleInfoMapper.addArticle(articleInfo);
    }

    public Integer addArticlePoto(Map<String, Object> map) {
        return articleInfoMapper.addArticlePoto(map);
    }
}
