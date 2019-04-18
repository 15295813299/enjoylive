package com.qf.mapper;

import java.sql.Timestamp;
import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/16/22:50
 */
public interface JxArticleInfoMapper {
    Map getInfo(int articleId);

    int[] getArticleIdByCategoryName(String categoryName);

    int[] getIdBySupport();

    int[] getIdByBrowse();

    int[] getIdByComment();

    int[] getIdByTime();

    int[] getIdByTimestamp(Timestamp timestamp);

    int[] getIdByTitleDim(String test);

    int getSupportCountByArticleId(int articleId);

    int getBrowseCountByArticleId(int articleId);

    int getCommentCountByArticleId(int articleId);

    Map getPotoPathByArticleId(int articleId);

    Map getCategoryNameByArticleId(int articleId);

    int increaseTagTotalByName(String text);

    int addTag(String text);
}
