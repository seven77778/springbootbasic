package com.springboot.goodgoodstudy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/22 09:57.
 *
 * @author lsh
 * @date 2018/11/22
 *
 * 比较时间大小的方法 -- localdate isbefore isafter
 *
 * 1.since1.8,java.time包
 * 2.Instant 线程安全，如何;localtime also is thread-safe
 */
public class CompareTimeTest {

    private String name = "jack";
    private String age ="22";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(name).append(age).toString();
    }

    /**
     * test for basic usage
     */
    @Test
    public void test1(){
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        System.out.println(LocalTime.now());

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires")));

        System.out.println(LocalTime.of(12,22));
        System.out.println(LocalDate.of(2018,11,22));

        System.out.println(LocalDate.parse("2018-11-22"));

        System.out.println(Instant.now());

        LocalDate l1 = LocalDate.now();
        LocalDate l2 = LocalDate.now();

        System.out.println(l1.toEpochDay());
        System.out.println(l2.plusDays(-1));
        System.out.println(l1.isBefore(l2.minusDays(1)));
        System.out.println(l1.isBefore(l2.minusDays(-1)));

        System.out.println(TemporalAdjusters.lastDayOfMonth());

    }

    /**
     * how to compare 2 time
     */
    public void test2(){

    }

    /**
     * 测试打印类输出
     */
    public static void main(String[] args) {
        System.out.println(new CompareTimeTest());
    }
}
