package com.qf.mapper;

import com.qf.dto.BrowselnfoListDto;
import com.qf.dto.HotListDto;
import com.qf.dto.NoneSupportCategory;
import com.qf.pojo.Category;

import java.util.List;

public interface CategoryMapper {

    /**
     * 获取文章类型中的子类（parentId ！= 0）
     * @return 文章类型的子类集合
     */
    public List<Category> getCategoryIdList();

    /***
     *  获取所有文章的大类
     * @return 版块的大类集合
     */
    List<Category> getBigCategoryList();

    /***
     *
     * @param categoryName 大版块名称
     * @return 大版块点赞数第一位
     */
    List<HotListDto> getHotCategory(String categoryName);

    /***
     *
     * @param categoryName 大版块名称
     * @return 大版块浏览数数第一位
     */
    List<BrowselnfoListDto> getBrowseCategory(String categoryName);

    /***
     *
     * @param categoryName 大版块名称
     * @return 大版块评论数数第一位
     */
    List<BrowselnfoListDto> getCommentCategory(String categoryName);
    /***
     *
     * @param categoryName 大版块名称
     * @return  大版块的图片 和 未点赞的所有文章数
     */
    NoneSupportCategory getNoneSupportCategory(String categoryName);



    NoneSupportCategory getArticleCountToCategory(String categoryName);

    /***
     *
     * @param userInfoId 用户ID
     * @return  该用户底下所有的文章
     */
   List<HotListDto> getUserInfoToShowArticle(Integer userInfoId);
}
