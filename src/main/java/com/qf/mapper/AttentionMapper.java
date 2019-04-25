package com.qf.mapper;

import com.qf.dto.MyAttention;
import com.qf.pojo.Attention;

import java.util.List;

public interface AttentionMapper {
    /**
     * 添加关注
     * @param attention 用户id和作者id
     * @return影响行数
     */
    public Integer addAttention(Attention attention);

    /**
     * 删除关注
     * @param attention 用户id和作者id
     * @return影响行数
     */
    public Integer deleteAttention(Attention attention);

    /**
     *
     * @param integer 用户id
     * @return 所有的关注对象的头像，id,姓名
     */
    public List<MyAttention> getAttention1(Integer integer);

    /**
     *
     * @param integer 单个关注对象的id
     * @return  对象的人气量
     */
    public Integer getAttention2(Integer integer);

    /**
     *
     * @param integer   单个关注对象的id
     * @return  对象的被点赞数
     */
    public Integer getAttention3(Integer integer);

    /**
     *
     * @param integer   单个关注对象的id
     * @return  对象的粉丝数
     */
    public Integer getAttention4(Integer integer);

    /**
     * 判断用户是否已关注
     * @param attention 返回行数
     * @return
     */
    public Integer judgeAttention(Attention attention);
}
