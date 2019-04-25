package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Sin
 * @date 2019/4/25/10:13
 */
@SuppressWarnings("unused")
@Data
public class JxCollect implements Serializable {
    private Integer collectId;
    private Integer userInfoId;
    private Integer articleId;
    private Timestamp collectTime;
    private Integer flag;
}