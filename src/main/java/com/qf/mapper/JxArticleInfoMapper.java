package com.qf.mapper;

import com.qf.pojo.JxTag;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/16/22:50
 */
public interface JxArticleInfoMapper {
    /**
     * 根据文章id获取详细信息
     * @param articleId 文章id
     * @return 文章详细信息
     */
    Map getInfo(int articleId);

    /**
     * 根据类别获取文章id
     * @param categoryName 类别
     * @return 文章id
     */
    int[] getArticleIdByCategoryName(String categoryName);

    /**
     * 根据点赞数减序获取文章id
     * @return 文章id
     */
    int[] getIdBySupport();

    /**
     * 根据游览数获取文章id
     * @return 文章id
     */
    int[] getIdByBrowse();

    /**
     * 根据评论数获取文章id
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
     * @param timestamp 时间
     * @return 文章id
     */
    int[] getIdByTimestamp(Timestamp timestamp);

    /**
     * 根据文章标题模糊查询文章id
     * @param test 文章标题
     * @return 文章id
     */
    int[] getIdByTitleDim(String test);

    /**
     * 根据文章id获取点赞数
     * @param articleId 文章id
     * @return 点赞数
     */
    int getSupportCountByArticleId(int articleId);

    /**
     * 根据文章id获取游览数
     * @param articleId 文章id
     * @return 游览数
     */
    int getBrowseCountByArticleId(int articleId);

    /**
     * 根据文章id获取评论数
     * @param articleId 文章id
     * @return 评论数
     */
    int getCommentCountByArticleId(int articleId);

    /**
     * 根据文章id获取图片路径
     * @param articleId 文章id
     * @return 图片路径
     */
    Map getPotoPathByArticleId(int articleId);

    /**
     * 根据文章id获取类别名称
     * @param articleId 文章id
     * @return 类别名称
     */
    Map getCategoryNameByArticleId(int articleId);

    /**
     * 根据标题名称增加次数
     * @param text 标题名
     * @return 影响
     */
    int increaseTagTotalByName(String text);

    /**
     * 插入新标题
     * @param text 标题名
     * @return 影响
     */
    int addTag(String text);

    /**
     * 查询所有标签
     * @return 所有标签
     */
    List<JxTag> selectAllTag();

    /**
     * 根据标签名查询文章id
     * @param tagNameList 标签集合
     * @return 文章id
     */
    int[] selectArticleInfoIdByTagName(List<String> tagNameList);
}
