package com.springboot.designmode.observe;

import org.springframework.context.ApplicationEvent;

/**
 * Created by lsh on 2018/11/14 11:35.
 *
 * @author lsh
 * @date 2018/11/14
 */
public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Object source) {
        super(source);
    }
}
