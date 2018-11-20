package com.springboot.designmode.observe;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * Created by lsh on 2018/11/14 11:37.
 *
 * @author lsh
 * @date 2018/11/14
 */
@Service
public class WechatListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("2 send wechat");
    }
}
