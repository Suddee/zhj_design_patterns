package com.zhj.app.add;

import com.zhj.app.Beverage;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:33 2020/11/4
 * @ Description：摩卡，附加料
 * @ Modified By：
 * @Version:
 */
public class Mocha extends Additional {
    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    /**
     * 构造器初始化饮料变量
     *
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public int cost() {
        return 5+beverage.cost();
    }
}
