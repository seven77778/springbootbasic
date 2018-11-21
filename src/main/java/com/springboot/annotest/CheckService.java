package com.springboot.annotest;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2018/11/21 09:46.
 *
 * @author lsh
 * @date 2018/11/21
 */
@Component("ser")
public class CheckService {

    private Map<String,DataFlow> map = Maps.newHashMap();

    public CheckService(List<DataFlow> list){
        for(DataFlow dataFlow : list){
            map.put(dataFlow.getTpye(),dataFlow);
        }
    }

    public void doCheck(String type){
        map.get(type).check();
    }
}
