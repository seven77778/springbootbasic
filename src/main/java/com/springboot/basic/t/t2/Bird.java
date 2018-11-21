package com.springboot.basic.t.t2;

/**
 * Created by lsh on 2018/11/21 18:00.
 *
 * @author lsh
 * @date 2018/11/21
 */
public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(getName() + " fly ");
    }
}
