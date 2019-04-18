package com.qf.mapper;

import com.qf.pojo.JxTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Sin
 * @date 2019/4/16/19:42
 */
public interface JxTagMapper {
    /**
     * 分页查询
     * @param skipNum 跳过数据的数量
     * @param num 返回数据的数量
     * @return 数据集合
     */
    List<JxTag> getPage(@Param("skipNum") int skipNum,@Param("num") int num);

    /**
     * 根据标签集合查出文章id数组
     * @param tagNameList 标签集合
     * @return id数组
     */
    int[] getArticleInfoIds(List<String> tagNameList);
}
