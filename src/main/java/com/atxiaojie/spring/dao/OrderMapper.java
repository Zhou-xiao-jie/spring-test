package com.atxiaojie.spring.dao;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select 'order'")
    public String selectById(int i);
}
