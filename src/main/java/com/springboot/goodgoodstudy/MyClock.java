package com.springboot.goodgoodstudy;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Created by lsh on 2018/11/22 10:09.
 *
 * @author lsh
 * @date 2018/11/22
 */
public class MyClock extends Clock {
    @Override
    public ZoneId getZone() {
        return null;
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return null;
    }

    @Override
    public Instant instant() {
        return null;
    }
}
