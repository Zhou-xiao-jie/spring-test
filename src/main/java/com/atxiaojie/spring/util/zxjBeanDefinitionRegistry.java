package com.atxiaojie.spring.util;

import com.atxiaojie.spring.annotation.zxjScan;
import com.atxiaojie.spring.dao.OrderMapper;
import com.atxiaojie.spring.dao.UserMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: zxjBeanDefinitionRegistry
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/12/5 19:34
 * @Version: V1.0.0
 */
public class zxjBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(zxjScan.class.getName());
        Object value = annotationAttributes.get("value");


        List<Class> mappers = new ArrayList<Class>();
        mappers.add(OrderMapper.class);
        mappers.add(UserMapper.class);

        for(Class mapper : mappers){
            AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
            beanDefinition.setBeanClass(zxjFactoryBean.class);
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(mapper);
            registry.registerBeanDefinition(mapper.getName(), beanDefinition);
        }

    }
}
