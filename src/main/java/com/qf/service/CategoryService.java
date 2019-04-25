package com.qf.service;

import com.qf.dto.BrowselnfoListDto;
import com.qf.dto.HotListDto;
import com.qf.dto.NoneSupportCategory;
import com.qf.pojo.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 获取文章类型中的子类（parentId ！= 0）
     * @return 文章类型的子类集合
     */
    public List<Category> getCategoryIdList();

    List<Category> getBigCategoryList();

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

    /***
     *
     * @param categoryName  大版块名称
     * @return  未点赞的所有文章数
     */
    NoneSupportCategory getArticleCountToCategory(String categoryName);

    /***
     *
     * @param userInfoId  用户ID
     * @return  该用户所有的文章
     */
    List<HotListDto> getUserInfoToShowArticle(Integer userInfoId);
}
