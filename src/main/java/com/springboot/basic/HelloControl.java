package com.springboot.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lsh on 2018/11/16 10:09.
 *
 * @author lsh
 * @date 2018/11/16
 *
 * @controller error :This application has no explicit mapping for /error, so you are seeing this as a fallback.
 * @RestController ok
 */
@RestController
public class HelloControl {

    @RequestMapping("/hello")
    public String hello(){
        return "hello 1116";
    }

}
