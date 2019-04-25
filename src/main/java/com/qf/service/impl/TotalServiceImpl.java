package com.qf.service.impl;

import com.qf.mapper.TotalMapper;
import com.qf.pojo.Total;
import com.qf.service.TotalService;
import com.qf.tools.GetIpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TotalServiceImpl implements TotalService  {

    @Autowired
    TotalMapper totalMapper;

    public Boolean upTotalById(Total total, HttpServletRequest httpServletRequest) {
        Total totalById = totalMapper.getTotalById(total);
        if (totalById==null){
            GetIpUtils getIpUtils = new GetIpUtils();
            total.setLoginIp(getIpUtils.getIpAddress(httpServletRequest));
            totalMapper.addTotal(total);
            return true;
        }

        String lateTime = totalById.getLateTime();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = fmt.parse(lateTime);//将数据库出的 timestamp 类型的时间转换为java的Date类型

        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String param = sdf.format(date);//参数时间
        String now = sdf.format(new Date());//当前时间
        if(!(param.equals(now))){
            GetIpUtils getIpUtils = new GetIpUtils();
            total.setLoginIp(getIpUtils.getIpAddress(httpServletRequest));
            totalMapper.addTotal(total);
            return true;
        }
        return false;
    }
}
