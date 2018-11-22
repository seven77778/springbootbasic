package com.springboot.lambda;

/**
 * Created by lsh on 2018/11/22 15:36.
 *
 * @author lsh
 * @date 2018/11/22
 */
public class Funzimpl implements FunctionTest {
    @Override
    public String getInfo(String info) {
        return null;
    }

    /**
     * 子类
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Funzimpl().getStr());
    }
}
