package com.qf.service;

import com.qf.pojo.JxTag;

import java.util.List;
import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/17/9:00
 */
public interface JxIArticleService {
    /**
     * 获取文章信息
     * @param articleId 文章id
     * @return 信息
     */
    Map getInfoMap(int articleId);

    /**
     * 根据类别获取文章id
     * @param categoryName 类别名
     * @return 文章id
     */
    int[] getArticleIdByCategoryName(String categoryName);

    /**
     * 根据点赞数减序获取文章id
     * @return 文章id
     */
    int[] getIdBySupport();

    /**
     * 根据游览数减序获取文章id
     * @return 文章id
     */
    int[] getIdByBrowse();

    /**
     * 根据评论数减序获取文章id
     * @return 文章id
     */
    int[] getIdByComment();

    /**
     * 根据时间减序获取文章id
     * @return 文章id
     */
    int[] getIdByTime();

    /**
     * 根据时间范围获取文章id
     * @param dayBefore 时间距离
     * @return 文章id
     */
    int[] getIdByTimestamp(int dayBefore);

    /**
     * 根据文章标题(模糊)获取文章id
     * @param test 文章标题
     * @return 文章id
     */
    int[] getIdByTitleDim(String test);

    /**
     * 判断标签名是否存在,存在则次数加一,否则创建
     * @param text
     */
    void checkHotTag(String text);

    /**
     * 获取所有标签
     * @return 所有标签
     */
    List<JxTag> getAllTag();

    /**
     * 根据标签名获取文章id
     * @param tagNames 标签数组
     * @return 文章id
     */
    int[] getArticleInfoIdByTagName(String[] tagNames);
}
