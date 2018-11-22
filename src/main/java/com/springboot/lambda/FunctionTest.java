package com.springboot.lambda;


/**
 * Created by lsh on 2018/11/22 13:54.
 *
 * @author lsh
 * @date 2018/11/22
 *
 * 函数式接口：-- 有且仅有一个抽象方法，Object的public方法除外(比如可以存在 boolean equals(Object o) )
 * 1、@FunctionalInterface 注解
 * 2、满足函数式接口的规范
 *
 * 规范如下：
 * 1.接口有且只能有个一个抽象方法，只有方法定义，没有方法体
 * 2.复写object类的public方法，不算入函数式接口的方法
 * 3.default 方法除外
 */
@FunctionalInterface
public interface FunctionTest {
    /**
     * 接口中的变量都是 public static final
     */
    public static final String name = "lsh";

    /**
     * 接口中的方法都是 public abstract
     */
    //public abstract void fun();
    //public abstract void fun2();

    @Override
    boolean equals(Object o);

    @Override
    public String toString();

    /**
     * 函数式接口中唯一
     */
    String getInfo(String info);

    default String getStr(){
        return "default method";
    }

    /**
     * 接口中具体方法的存在 ？
     * @return
     */
    public static  String hhaha(){
        System.out.println("接口中的具体方法");
        return "abc";
    }

    /**
     * 接口的内部类，都是 public static
     * 内部类的构造无要求
     */
    public static class A{
       public static String age;

    }

    /**
     * 函数式接口 创建实例 的几种方式
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(A.age);
        //1-lambda 实例化接口
        FunctionTest functionTest = gg -> gg+1;
        System.out.println(functionTest.getInfo("1-lambda 实例化接口"));
        FunctionTest.hhaha();

        //2-构造方法引用
        FunctionTest functionTest1 = String :: new;

        System.out.println(functionTest1.getInfo("2-构造方法引用"));

        //3-匿名内部类
        FunctionTest functionTest2 = new FunctionTest() {
            @Override
            public String getInfo(String info) {
                return "3- 匿名内部类";
            }
        };
        System.out.println(functionTest2.getInfo(""));

        //4-方法引用
        //FunctionTest functionTest3 = Main::getMessage;
    }

}
