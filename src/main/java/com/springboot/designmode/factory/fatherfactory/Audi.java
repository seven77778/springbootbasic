package com.springboot.designmode.factory.fatherfactory;

/**
 * Created by lsh on 2018/11/20 16:15.
 *
 * @author lsh
 * @date 2018/11/20
 */
public class Audi extends Car {
    @Override
    void drive() {
        System.out.println("this is audi");
    }
}
