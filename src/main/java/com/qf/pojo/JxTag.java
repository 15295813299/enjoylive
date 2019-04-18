package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Sin
 * @date 2019/4/16/19:46
 */
@Data
public class JxTag implements Serializable {
    /**
     * 标签id
     */
    Integer tagId;
    /**
     * 标签名
     */
    String tagName;
    /**
     * 被查询次数
     */
    Integer total;
}
