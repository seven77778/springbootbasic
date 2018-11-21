package com.springboot.annotest;

import org.springframework.stereotype.Service;

/**
 * Created by lsh on 2018/11/21 09:43.
 *
 * @author lsh
 * @date 2018/11/21
 */
@Service
public class NumDataFlow implements DataFlow {
    @Override
    public String getTpye() {
        return "num";
    }

    @Override
    public void check() {
        System.out.println("NumDataFlow");
    }
}
