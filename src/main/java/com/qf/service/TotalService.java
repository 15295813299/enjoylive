package com.qf.service;

import com.qf.pojo.Total;

import javax.servlet.http.HttpServletRequest;

public interface TotalService {


    public Boolean upTotalById(Total total, HttpServletRequest httpServletRequest);
}
