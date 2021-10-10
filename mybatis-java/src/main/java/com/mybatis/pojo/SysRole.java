package com.mybatis.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ：sjq
 * @date ：Created in 2021/10/10 上午11:43
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class SysRole {
    private Long id;
    private String roleName;
    private Integer enabled;
    private Long createBy;
    private LocalDateTime createTime;
}
