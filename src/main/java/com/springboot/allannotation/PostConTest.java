package com.springboot.allannotation;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/21 16:32.
 *
 * @author lsh
 * @date 2018/11/21
 *
 * 从Java EE5规范开始，Servlet增加了两个影响Servlet生命周期的注解（Annotation）：@PostConstruct和@PreConstruct。
 * 这两个注解被用来修饰一个非静态的void()方法.而且这个方法不能有抛出异常声明
 *
 * 1.@PostConstruct 在 onApplicationEvent 之前
 * 2.onApplicationEvent 执行了 4 次？
 * 3.other bean implement BeanPostProcessor，@PostConstruct 不执行
 *
 */
@Component
public class PostConTest implements ApplicationListener{

    @PostConstruct
    public void test() throws Exception{
        //System.out.println("PostConstruct");
        HashMap hashMap = new HashMap();
        hashMap.put(1,1);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //System.out.println("ApplicationListener");
    }
}
