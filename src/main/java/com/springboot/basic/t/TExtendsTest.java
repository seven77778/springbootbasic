package com.springboot.basic.t;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/21 17:26.
 *
 * @author lsh
 * @date 2018/11/21
 */
public class TExtendsTest {
    @Test
    public void test(){
        Dish<? extends Fruit> dish = new Dish<Apple>(new Apple());
    }

}
