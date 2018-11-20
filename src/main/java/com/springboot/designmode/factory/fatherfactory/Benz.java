package com.springboot.designmode.factory.fatherfactory;

/**
 * Created by lsh on 2018/11/20 16:14.
 *
 * @author lsh
 * @date 2018/11/20
 */
public class Benz extends Car {
    @Override
    void drive() {
        System.out.println("this is benz");
    }

    @Override
    void afterDrive() {
        System.out.println(" after : clean benz");
    }
}
