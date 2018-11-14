package com.springboot.basic;

import com.springboot.basic.listener.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lsh on 2018/11/14 11:58.
 *
 * @author lsh
 * @date 2018/11/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestForListener {

    @Autowired
    OrderService orderService;

    @Test
    public void test(){
        orderService.createOrder();
    }


}
