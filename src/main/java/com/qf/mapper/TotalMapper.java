package com.qf.mapper;

import com.qf.pojo.Total;

public interface TotalMapper {

    /**
     * 获取最近一次登录时间
     * @param total
     * @return
     */
    public Total getTotalById(Total total);

    /**
     * 添加数据
     * @param total
     * @return
     */
    public int addTotal(Total total);

}
