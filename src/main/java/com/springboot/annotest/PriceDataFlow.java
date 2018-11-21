package com.springboot.annotest;

import org.springframework.stereotype.Service;

/**
 * Created by lsh on 2018/11/21 09:44.
 *
 * @author lsh
 * @date 2018/11/21
 */
@Service
public class PriceDataFlow implements DataFlow {
    @Override
    public String getTpye() {
        return "price";
    }

    @Override
    public void check() {
        System.out.println("pricedataflow");
    }
}
