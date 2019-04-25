package com.qf.mapper;


import com.qf.pojo.SonComment;

import java.util.List;
import java.util.Map;

public interface SonCommentMapper {

    public Integer addSonComments(SonComment sonComment);

    public List<SonComment> getSonComments(Map<String, Object> map);

    /***
     *
     * @param articleId 文章id
     * @return 获取子评论数量
     */
    Integer sonCommentsCount(Integer articleId);
}
