package com.springboot.designmode.observe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/14 11:33.
 *
 * @author lsh
 * @date 2018/11/14
 *
 * spring observe -- 观察者模式
 */
@Component
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;

    public void createOrder(){
        System.out.println("create order ");
        applicationContext.publishEvent(new OrderEvent(new Object()));
    }


}