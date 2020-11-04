package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 10:59 2020/11/4
 * @ Description：饮料抽象类
 * @ Modified By：
 * @Version:
 */
public abstract class Beverage {
    public String description = "Unknown com.zhj.app.Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * cost方法返回饮料的价格，子类中实现
     */
    public abstract int cost();


}
