package com.springboot.designmode.factory.simplefactory;

/**
 * Created by lsh on 2018/11/20 14:50.
 *
 * @author lsh
 * @date 2018/11/20
 */
public class Banana implements Fruit {
    private static final double BANANA_PRICE = 3;
    @Override
    public void eat() {
        System.out.println("eat banana");
    }

    @Override
    public double getPrice() {
        return BANANA_PRICE;
    }
}
