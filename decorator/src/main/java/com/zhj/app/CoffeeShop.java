package com.zhj.app;

import com.zhj.app.add.Milk;
import com.zhj.app.add.Mocha;
import com.zhj.app.drinks.Tea;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 11:36 2020/11/4
 * @ Description：咖啡店，模拟用户下单
 * @ Modified By：https://www.cnblogs.com/of-fanruice/p/11565679.html
 * @Version:
 */
public class CoffeeShop {

    //点一杯茶+奶+摩卡+奶
    public static void main(String[] args) {
        Beverage tea = new Tea();

        tea = new Mocha(tea);

        tea = new Milk(tea);

        tea = new Milk(tea);

        System.out.println(tea.getDescription());

        System.out.println(tea.cost());
    }

}
