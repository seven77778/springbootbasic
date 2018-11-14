package com.springboot.basic.strategy;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

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
 */
@Component
public class PayService {


    Map<String, IDiscount> map = Maps.newHashMap();

    //list如何初始化的
    public PayService(List<IDiscount> list) {
        for(IDiscount iDiscount:list){
            map.put(iDiscount.getType(),iDiscount);
        }
    }

//    public PayService() {
//
//        System.out.println("default");
//    }

    public double payDiscount(String type, double cost){
        return map.get(type).discount(cost);
    }
}
