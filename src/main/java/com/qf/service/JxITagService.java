package com.qf.service;

import com.qf.pojo.JxTag;

import java.util.List;

/**
 * @author Sin
 * @date 2019/4/16/20:08
 */
public interface JxITagService {
    /**
     * 分页查询
     * @param pageNum 页码
     * @param pageSize 数据量
     * @return 数据列表
     */
    List<JxTag> getPage(int pageNum,int pageSize);

    int[] getArticleInfoIds(String[] tagNames);
}
