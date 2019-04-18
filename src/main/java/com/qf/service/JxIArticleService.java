package com.qf.service;

import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/17/9:00
 */
public interface JxIArticleService {
    /**
     * 获取文章展示框信息
     * @param articleId 文章id
     * @return 信息
     */
    Map getInfoMap(int articleId);

    int[] getArticleIdByCategoryName(String categoryName);

    int[] getIdBySupport();

    int[] getIdByBrowse();

    int[] getIdByComment();

    int[] getIdByTime();

    int[] getIdByTimestamp(int dayBefore);

    int[] getIdByTitleDim(String test);

    void checkHotTag(String text);
}
