package com.dubbo;

import com.api.RemoteService;
import com.api.RemoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LSH on 2018/12/2 - 16:25.
 * <p>
 * declaration :
 */
public class DubboConsumer {



    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "file:\\H:\\CODE\\github\\1115\\springbootbasic\\demo-web\\src\\main\\resources\\consumer.xml");
        context.start();
        RemoteService remoteService = (RemoteService)context.getBean("demoService");
        System.out.println(remoteService.getOrder("lll"));
    }
}
