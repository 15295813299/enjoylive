package com.qf.mapper;

import com.qf.dto.IntsDto;
import com.qf.pojo.Category;
import com.qf.vo.ChartVo;

import java.util.List;

public interface ChartMapper {

    public IntsDto getWeekCount(ChartVo chartVo);

    public IntsDto getWeekLike(ChartVo chartVo);

    public IntsDto getWeekComment(ChartVo chartVo);

    IntsDto getComment(ChartVo chartVo);
}
