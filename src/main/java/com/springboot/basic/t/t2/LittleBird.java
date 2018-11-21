package com.springboot.basic.t.t2;

/**
 * Created by lsh on 2018/11/21 18:01.
 *
 * @author lsh
 * @date 2018/11/21
 */
public class LittleBird extends Bird {
    public LittleBird(String name) {
        super(name);
    }

    public void sing(){
        System.out.println(getName() + " sing ");
    }
}
