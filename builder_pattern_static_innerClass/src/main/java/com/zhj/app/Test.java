package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:43 2020/9/23
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product build = concreteBuilder
                .bulidA("牛肉煲")
//              .bulidC("全家桶")
                .bulidD("冰淇淋")
                .build();
        System.out.println(build.toString());
    }
}
