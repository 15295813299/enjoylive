package com.qf.controller;

import com.qf.dto.IntsDto;
import com.qf.service.ChartService;
import com.qf.vo.ChartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartController {
    @Autowired
    ChartService chartService;

    /**
     * 获取游览量
     * @param chartVo
     * @return
     */
    @RequestMapping(value = "getWeekCount", method = RequestMethod.POST)
    public IntsDto getWeekCount(@RequestBody ChartVo chartVo){
        System.out.println(chartVo);
        IntsDto weekCount = chartService.getWeekCount(chartVo);
        System.out.println(weekCount);
        return weekCount;
    }

    /**
     * 获取点赞量
     * @param chartVo
     * @return
     */
    @RequestMapping(value = "getWeekLike", method = RequestMethod.POST)
    public IntsDto getWeekLike(@RequestBody ChartVo chartVo){
        System.out.println(chartVo);
        IntsDto weekCount = chartService.getWeekLike(chartVo);
        System.out.println(weekCount);
        return weekCount;
    }


    /**
     * 获取评论数
     * @param chartVo
     * @return
     */
    @RequestMapping(value = "getWeekComment", method = RequestMethod.POST)
    public IntsDto getWeekComment(@RequestBody ChartVo chartVo){

        IntsDto weekCount = chartService.getWeekComment(chartVo);
        return weekCount;
    }



    @RequestMapping(value = "getComment", method = RequestMethod.POST)
    public IntsDto getComment(@RequestBody ChartVo chartVo){

        IntsDto weekCount = chartService.getComment(chartVo);
        return weekCount;
    }

}
