package com.springboot.basic.strategy;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 *
 * 收费服务
 * 1.没有无参数的构造方法， Caused by: java.lang.NoSuchMethodException: com.designmode.strategy.PayService.<init>()
 * spring boot 直接执行，spring 中必须有无参的构造方法
 *
 * 2.list如何初始化 ？ -- @service 注入
 *
 * 3.@Autowired
List<IDiscount> discounts = new ArrayList<>();  -- 初始化顺序？
 * 构造方法先于 @service执行，通过构造器实例化的bean，才能注入啊
 *
 */
@Component
public class PayService {


    Map<String, IDiscount> map = Maps.newHashMap();

    @Autowired
    List<IDiscount> discounts = new ArrayList<>();

    /**
     * 1.有参构造方法是可以
     * 2.@auto注解也可以，在执行完构造方法以后
     */
    //list如何初始化的
    //public PayService(List<IDiscount> list) {
    //    for(IDiscount iDiscount:list){
    //        map.put(iDiscount.getType(),iDiscount);
    //    }
    //    System.out.println("ÿoucan");
    //}

    public void ss() {
        for (IDiscount iDiscount : discounts) {
            map.put(iDiscount.getType(), iDiscount);
        }
    }

    public double payDiscount(String type, double cost){
        System.out.println(map.size());
        return map.get(type).discount(cost);
    }
}
