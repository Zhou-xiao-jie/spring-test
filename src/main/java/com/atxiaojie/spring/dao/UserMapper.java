package com.atxiaojie.spring.dao;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select 'user'")
    public String selectById(int i);
}
