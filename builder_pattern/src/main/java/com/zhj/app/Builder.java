package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:25 2020/9/23
 * @ Description：抽象构造者
 * @ Modified By：
 * @Version:
 */
public interface Builder {
    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
