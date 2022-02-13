package com.atxiaojie.spring.service;

import com.atxiaojie.spring.dao.OrderMapper;
import com.atxiaojie.spring.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/12/5 19:33
 * @Version: V1.0.0
 */
@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    public void test(){
        System.out.println(userMapper.selectById(1));
        System.out.println(orderMapper.selectById(2));
    }
}
