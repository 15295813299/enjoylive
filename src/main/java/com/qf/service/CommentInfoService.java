package com.qf.service;

import com.qf.pojo.CommentInfo;

import java.util.List;

public interface CommentInfoService {
    /**
     * 获取一级评论
     * @param articleId 文章id
     * @return 返回一级评论的属性和评论人昵称
     */
    public List<CommentInfo> getComments(Integer articleId);

    public boolean addComments(CommentInfo commentInfo);

    Integer commentsCount(Integer articleId);
}
