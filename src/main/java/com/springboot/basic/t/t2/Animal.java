package com.springboot.basic.t.t2;

/**
 * Created by lsh on 2018/11/21 17:58.
 *
 * @author lsh
 * @date 2018/11/21
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println(getName()+" eat");
    }
}
