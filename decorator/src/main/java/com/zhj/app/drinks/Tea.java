package com.zhj.app.drinks;

import com.zhj.app.Beverage;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:21 2020/11/4
 * @ Description：茶，具体饮料
 * @ Modified By：
 * @Version:
 */
public class Tea extends Beverage {

    public Tea(){
        description = "tea";
    }

    @Override
    public int cost() {
        return 15;
    }
}
