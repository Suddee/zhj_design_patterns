package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:30 2020/9/23
 * @ Description：指挥者
 * @ Modified By：
 * @Version:
 */
public class Director {
    public Product create(Builder builder){
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}
