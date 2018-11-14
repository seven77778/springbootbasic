package com.springboot.basic.strategy;

import org.springframework.stereotype.Service;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 */
//@Service
public class NormalDiscount implements IDiscount {
    @Override
    public String getType() {
        return "normal";
    }

    @Override
    public Double discount(double cost) {
        return cost;
    }
}
