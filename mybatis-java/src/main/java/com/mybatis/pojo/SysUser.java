package com.mybatis.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ：sjq
 * @date ：Created in 2021/10/10 上午9:58
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class SysUser {
    private Long id;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private LocalDateTime createTime;
}
