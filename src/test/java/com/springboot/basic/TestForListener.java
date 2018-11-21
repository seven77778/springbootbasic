package com.springboot.basic;

import com.springboot.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lsh on 2018/11/14 11:58.
 *
 * @author lsh
 * @date 2018/11/14
 *
 * 1.测试类 只能有一个构造函数？
 * java.lang.IllegalArgumentException: Test class can only have one constructor
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestForListener {

}
