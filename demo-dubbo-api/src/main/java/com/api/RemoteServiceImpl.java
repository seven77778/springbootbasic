package com.api;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by LSH on 2018/12/1.
 *
 * @author LSH
 * @date 2018/12/1
 */
@Service
@Component
public class RemoteServiceImpl implements RemoteService {
    @Override
    public String getOrder(String name) {
        return name + "get order.";
    }
}
