package com.qf.service;

import com.qf.dto.MyAttention;
import com.qf.pojo.Attention;

import java.util.List;

public interface AttentionService {
    /**
     * 添加粉丝
     * @param attention 用户id和作者id
     * @return 返回添加结果
     */
    public boolean addAttention(Attention attention);

    /**
     * 删除粉丝
     * @param attention 用户id和作者id
     * @return 返回删除结果
     */
    public boolean deleteAttention(Attention attention);

    /**
     *
     * @param integer 用户id
     * @return  用户所关注对象 id 昵称 头像 人气 被赞量 粉丝数
     */
    public List<MyAttention> getAttention(Integer integer);

    /**
     * 判断用户是否已关注
     * @param attention
     * @return 判断结果
     */
    public boolean judgeAttention(Attention attention);
}
