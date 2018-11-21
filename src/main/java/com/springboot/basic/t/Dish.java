package com.springboot.basic.t;

/**
 * Created by lsh on 2018/11/21 17:28.
 *
 * @author lsh
 * @date 2018/11/21
 */
public class Dish<T extends Fruit> {
    private T item;

    public Dish(T item) {
        this.item = item;
    }

    public Dish() {
    }

}
