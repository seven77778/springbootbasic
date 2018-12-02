package com.example.demo;

import com.api.RemoteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by LSH on 2018/12/1.
 *
 * @author LSH
 * @date 2018/12/1
 */
@RestController
public class OrderControl {

    @Resource
    RemoteServiceImpl remoteService;

    @RequestMapping("/order")
    public String get(String name){
        System.out.println("this /hello");
        return remoteService.getOrder("lsh ");
    }
}
