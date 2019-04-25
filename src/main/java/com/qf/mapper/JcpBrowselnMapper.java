package com.qf.mapper;

import com.qf.vo.JcpBrowselnVo;

public interface JcpBrowselnMapper {
    Integer getIsBrowselnArticleId(JcpBrowselnVo jcpBrowselnVo);
    Integer insertBrowselnVo(JcpBrowselnVo jcpBrowselnVo);
    Integer getIsBrowselnUserInfoId(JcpBrowselnVo jcpBrowselnVo);
    Integer getBrowselnCount(JcpBrowselnVo jcpBrowselnVo);
}
