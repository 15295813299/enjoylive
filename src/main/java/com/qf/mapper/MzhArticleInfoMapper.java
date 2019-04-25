package com.qf.mapper;
import com.qf.dto.MzhArticleInfoDto;

import java.util.List;

public interface MzhArticleInfoMapper {
    List<MzhArticleInfoDto> getArticleByCid(int categoryId);
    MzhArticleInfoDto getArticle(int articleId);
}
