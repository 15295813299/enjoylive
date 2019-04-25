package com.qf.service.impl;

import com.qf.mapper.ViolateMapper;
import com.qf.service.ViolateService;
import com.qf.vo.ViolateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViolateServiceImpl implements ViolateService {
    @Autowired
    ViolateMapper violateMapper;
    /**
     *  添加举报信息
     * @param violateVo
     * @return
     */
    public boolean AddViolateContext(ViolateVo violateVo) {
        Integer count = this.violateMapper.AddViolateContext(violateVo);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }
}
