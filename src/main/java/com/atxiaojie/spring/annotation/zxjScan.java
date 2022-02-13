package com.atxiaojie.spring.annotation;

import com.atxiaojie.spring.util.zxjBeanDefinitionRegistry;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Import({zxjBeanDefinitionRegistry.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface zxjScan {

    String value() default "";
}
