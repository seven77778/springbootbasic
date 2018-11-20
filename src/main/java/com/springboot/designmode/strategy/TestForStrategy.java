package com.springboot.designmode.strategy;

import javax.annotation.Resource;

import com.springboot.basic.DemoApplication;
import com.springboot.designmode.observe.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lsh on 2018/11/20 16:50.
 *
 * @author lsh
 * @date 2018/11/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestForStrategy {

    @Resource(name = "pay")
    PayService payService;

    @Test
    public void test(){
        payService.payDiscount("vip",100);
    }
}
