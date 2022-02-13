package com.atxiaojie.spring.util;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: zxjFactoryBean
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/12/5 19:34
 * @Version: V1.0.0
 */
public class zxjFactoryBean implements FactoryBean {

    private Class mapper;

    public zxjFactoryBean(Class mapper) {
        this.mapper = mapper;
    }

    public Object getObject() throws Exception {
        Object o = Proxy.newProxyInstance(zxjFactoryBean.class.getClassLoader(), new Class[]{mapper}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(Object.class.equals(method.getDeclaringClass())){
                    return  method.invoke(this, args);
                }
                return null;
            }
        });
        return o;
    }

    public Class<?> getObjectType() {
        return mapper;
    }
}
