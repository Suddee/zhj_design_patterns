package com.zhj.app.add;

import com.zhj.app.Beverage;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:24 2020/11/4
 * @ Description：附加料抽象类，继承饮料抽象类
 * @ Modified By：
 * @Version:
 */
public abstract class Additional extends Beverage {

    /**
     * 所有的调料装饰者都必须重新实现getDescription()方法
     * 这样才能够用递归的方式来得到所选饮料的整体描述
     *
     * @return
     */
    @Override
    public abstract String getDescription();
}
