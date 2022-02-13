package com.atxiaojie.spring;

import com.atxiaojie.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/12/5 19:52
 * @Version: V1.0.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.test();
    }
}
