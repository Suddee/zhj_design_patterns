package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:35 2020/9/23
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public interface Builder {
    //汉堡
    abstract Builder bulidA(String mes);
    //饮料
    abstract Builder bulidB(String mes);
    //薯条
    abstract Builder bulidC(String mes);
    //甜品
    abstract Builder bulidD(String mes);
    //获取套餐
    abstract Product build();
}
