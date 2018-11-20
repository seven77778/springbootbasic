package com.springboot.designmode.factory.simplefactory;

/**
 * Created by lsh on 2018/11/20 14:46.
 *
 * @author lsh
 * @date 2018/11/20
 */
public class Apple implements Fruit {
    private static final double APPLE_PRICE = 5;
    @Override
    public void eat() {
        System.out.println("eat apple");
    }

    @Override
    public double getPrice() {
        return APPLE_PRICE;
    }
}
