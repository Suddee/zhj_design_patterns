package com.zhj.app;

import com.zhj.app.factory.AbstractFactory;
import com.zhj.app.factory.AppleFactory;
import com.zhj.app.factory.XiaoMiFactory;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:37 2020/9/14
 * @ Description：上面两种模式不管工厂怎么拆分抽象，都只是针对一类产品Phone（AbstractProduct），
 * 如果要生成另一种产品PC，应该怎么表示呢？
 * 最简单的方式是把2中介绍的工厂方法模式完全复制一份，不过这次生产的是PC。
 * 但同时也就意味着我们要完全复制和修改Phone生产管理的所有代码，显然这是一个笨办法，并不利于扩展和维护。
 * 抽象工厂模式通过在AbstarctFactory中增加创建产品的接口，并在具体子工厂中实现新加产品的创建，
 * 当然前提是子工厂支持生产该产品。否则继承的这个接口可以什么也不干。
 * @ Modified By：
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        miFactory.makePC();                // make xiaomi PC!
        appleFactory.makePhone();        // make iphone!
        appleFactory.makePC();            // make MAC!
    }
}
