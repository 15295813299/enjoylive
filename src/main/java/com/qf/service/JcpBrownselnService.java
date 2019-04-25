package com.qf.service;

import com.qf.vo.JcpBrowselnVo;

public interface JcpBrownselnService {
    Integer getIsBrowselnArticleId(JcpBrowselnVo jcpBrowselnVo);
    Integer insertBrowselnVo(JcpBrowselnVo jcpBrowselnVo);
    Integer getIsBrowselnUserInfoId(JcpBrowselnVo jcpBrowselnVo);
    Integer getBrowselnCount(JcpBrowselnVo jcpBrowselnVo);
}
