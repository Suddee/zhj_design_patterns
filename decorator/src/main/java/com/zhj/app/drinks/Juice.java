package com.zhj.app.drinks;

import com.zhj.app.Beverage;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:04 2020/11/4
 * @ Description：果汁，具体饮料
 * @ Modified By：
 * @Version:
 */
public class Juice extends Beverage {
    public Juice(){
        description = "juice";
    }

    @Override
    public int cost() {
        return 8;
    }
}
