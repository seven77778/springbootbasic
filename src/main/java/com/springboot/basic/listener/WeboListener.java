package com.springboot.basic.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/14 12:40.
 *
 * @author lsh
 * @date 2018/11/14
 */
@Component
public class WeboListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("3 send weibo");
    }
}
