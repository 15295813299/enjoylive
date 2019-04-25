package com.qf.mapper;

import com.qf.vo.ViolateVo;

public interface ViolateMapper {
    /**
     * 添加举报信息
     * @param violateVo
     * @return
     */
    public Integer AddViolateContext(ViolateVo violateVo);
}
