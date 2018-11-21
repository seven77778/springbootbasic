package com.springboot.allannotation;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/21 16:50.
 *
 * @author lsh
 * @date 2018/11/21
 *
 * postProcessBeforeInitialization 使用方式，应该是 bean instanceof xxx
 * 类似 onApplicationEvent ，event instanceof ContextRefreshedEvent 这种
 */

@Component
public class BeanPostTest implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("postProcessBeforeInitialization");
        //System.out.println(bean.getClass().getSimpleName());
        return null;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    //@PostConstruct
    //public void test(){
    //    System.out.println("BeanPostTest - @PostConstruct");
    //}
}
