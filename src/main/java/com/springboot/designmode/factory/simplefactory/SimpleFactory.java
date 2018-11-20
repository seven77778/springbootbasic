package com.springboot.designmode.factory.simplefactory;

import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/20 14:51.
 *
 * @author lsh
 * @date 2018/11/20
 *
 * 简单工厂模式
 * 每新增一类水果，都需要修改factory的逻辑
 */
@Component
public class SimpleFactory {

    public static Fruit getInstance(String name){
        switch (name){
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            default :return null;
        }
    }

    /**
     * 改进版 避免每次新增水果修改逻辑
     * 通过反射
     *
     * 缺点：需要提供完整的类名
     */
    public static Fruit getInstanceEnhance(String name){
        try {
            return (Fruit)Class.forName(name).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过配置文件实例化 -- IOC 是工厂模式升级版
     *
     */
    public static Fruit getInstanceFromXml(){

        return null;
    }




    public static void main(String[] args) {
        getInstance("apple").eat();
        getInstanceEnhance("com.springboot.designmode.factory.simplefactory.Apple").eat();
    }
}
