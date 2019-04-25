package com.qf.service;

import com.qf.vo.ViolateVo;

public interface ViolateService {
    /**
     * 添加举报信息
     * @param violateVo
     * @return
     */
    public boolean AddViolateContext(ViolateVo violateVo);
}
