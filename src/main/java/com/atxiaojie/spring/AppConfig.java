package com.atxiaojie.spring;

import com.atxiaojie.spring.annotation.zxjScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/12/5 19:44
 * @Version: V1.0.0
 */
@Configuration
@ComponentScan("com.atxiaojie.spring")
@zxjScan("com.atxiaojie.spring.dao")
public class AppConfig {
}
