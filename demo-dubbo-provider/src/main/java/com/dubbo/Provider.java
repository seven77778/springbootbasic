package com.dubbo;

import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LSH on 2018/12/2.
 *
 *
 */
public class Provider {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "file:\\H:\\CODE\\github\\1115\\springbootbasic\\demo-web\\src\\main\\resources\\dubbo.xml");

        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
