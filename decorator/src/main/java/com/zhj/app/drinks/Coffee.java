package com.zhj.app.drinks;

import com.zhj.app.Beverage;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:02 2020/11/4
 * @ Description：咖啡，具体饮料
 * @ Modified By：
 * @Version:
 */
public class Coffee extends Beverage {
    public Coffee(){
        description = "com.zhj.app.drinks.Coffee";
    }

    @Override
    public int cost() {
        return 10;
    }
}
