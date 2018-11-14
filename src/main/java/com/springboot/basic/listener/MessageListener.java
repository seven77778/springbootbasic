package com.springboot.basic.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/14 11:36.
 *
 * @author lsh
 * @date 2018/11/14
 */

@Configuration
public class MessageListener implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println(" 1 send message ");
    }
}
