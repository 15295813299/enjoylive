package com.qf.service;

import com.qf.dto.MzhArticleInfoDto;

import java.util.List;

public interface MzhArticleInfoService {
    List<MzhArticleInfoDto> getArticleByCid(int categoryId);
    MzhArticleInfoDto getArticle(int articleId);
}
