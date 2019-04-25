package com.qf.service.impl;

import com.qf.dto.IntsDto;
import com.qf.mapper.ChartMapper;
import com.qf.pojo.Category;
import com.qf.service.ChartService;
import com.qf.vo.ChartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ChartServiceImpl implements ChartService {

    @Autowired
    ChartMapper chartMapper;

    public IntsDto getWeekCount(ChartVo chartVo) {
        return chartMapper.getWeekCount(chartVo);
    }

    public IntsDto getWeekLike(ChartVo chartVo) {
        return chartMapper.getWeekLike(chartVo);
    }

    public IntsDto getWeekComment(ChartVo chartVo) {
        return chartMapper.getWeekComment(chartVo);
    }

    public IntsDto getComment(ChartVo chartVo) {
        return chartMapper.getComment(chartVo);
    }
}
