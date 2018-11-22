package com.springboot.lambda;

import java.util.Arrays;
import java.util.List;

import javax.xml.transform.Source;

import org.assertj.core.util.Lists;
import org.junit.Test;

/**
 * Created by lsh on 2018/11/22 11:43.
 *
 * @author lsh
 * @date 2018/11/22
 */
public class LambdaTest {

    /**
     * -> 替代的是 new Runnable
     * Runnable 只有一个抽象方法的接口，被称为函数式接口
     *
     */
    @Test
    public void test(){
        new Thread(() -> System.out.println("lambda"));

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    /**
     * 1.7 1.8 比较list操作
     */
    @Test
    public void test1(){
        List list1 = Lists.newArrayList(1,2,3,4,5);
        list1.stream().forEach(x -> System.out.println(x));
    }
}
