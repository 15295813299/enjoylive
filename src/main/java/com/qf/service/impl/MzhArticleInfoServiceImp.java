package com.qf.service.impl;

import com.qf.dto.MzhArticleInfoDto;
import com.qf.mapper.MzhArticleInfoMapper;
import com.qf.service.MzhArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MzhArticleInfoServiceImp implements MzhArticleInfoService {
    @Autowired
    MzhArticleInfoMapper mzhArticleInfoMapper;
    public List<MzhArticleInfoDto> getArticleByCid(int categoryId) {
        return mzhArticleInfoMapper.getArticleByCid(categoryId);
    }

    public MzhArticleInfoDto getArticle(int articleId) {
        return mzhArticleInfoMapper.getArticle(articleId);
    }
}
