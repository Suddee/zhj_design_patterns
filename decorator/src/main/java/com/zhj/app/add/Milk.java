package com.zhj.app.add;

import com.zhj.app.Beverage;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:35 2020/11/4
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class Milk extends Additional {
    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    /**
     * 构造器初始化饮料变量
     *
     * @param beverage
     */
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+",milk";
    }

    @Override
    public int cost() {
        return 6+beverage.cost();
    }
}
