package com.springboot.annotest;

import com.springboot.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lsh on 2018/11/21 10:08.
 *
 * @author lsh
 * @date 2018/11/21
 *
 * @RunWith(Parameterized.class)
 *
 * @SpringBootApplication 注解的启动类，应该在包的最外面
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestForAnno {

    @Autowired
    CheckService checkService;

    @Test
    public void test(){
        checkService.doCheck("num");
    }
}
