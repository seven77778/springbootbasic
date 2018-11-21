package com.springboot.allannotation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/21 19:36.
 *
 * @author lsh
 * @date 2018/11/21
 */

@Component
public class IninTest implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }



    public IninTest() {
        System.out.println("构造方法");
    }

    @PostConstruct
    public void test(){
        System.out.println(" @PostConstruct");
    }

    public void init(){
        System.out.println("init");
    }
}
