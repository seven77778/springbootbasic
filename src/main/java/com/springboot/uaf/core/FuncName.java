package com.springboot.uaf.core;

/**
 * Created by lsh on 2018/11/21 10:51.
 *
 * @author lsh
 * @date 2018/11/21
 *
 * 用于表示接口名称，以及区分内部接口和外部接口
 */
public interface FuncName {
    String getName();

    /**
     * 区分接口的分类 inner，outer
     *
     */
    String getType();
}
