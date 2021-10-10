package com.mybatis.dao;

import com.mybatis.pojo.Country;

import java.util.List;

/**
 * @author ：sjq
 * @date ：Created in 2021/10/7 下午10:37
 * @description：
 * @modified By：
 * @version: $
 */
public interface CountryMapper {
    List<Country> selectAll();
}
