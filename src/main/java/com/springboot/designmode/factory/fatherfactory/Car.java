package com.springboot.designmode.factory.fatherfactory;

/**
 * Created by lsh on 2018/11/20 16:09.
 *
 * @author lsh
 * @date 2018/11/20
 */
public abstract class Car {

    void beforeDirve(){
        System.out.println("before drive,check car");
    }

    abstract void drive();

    void afterDrive(){
        System.out.println("after drive,clean car");
    }

    public static void main(String[] args) {
        Car car = new Benz();
        car.beforeDirve();
        car.drive();
        car.afterDrive();
    }
}
