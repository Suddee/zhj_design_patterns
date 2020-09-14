package com.zhj.app;

import com.zhj.app.factory.AbstractFactory;
import com.zhj.app.factory.AppleFactory;
import com.zhj.app.factory.MiFactory;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:23 2020/9/14
 * @ Description：工厂方法模式，和简单工厂模式中工厂负责生产所有产品相比，
 * 工厂方法模式将生成具体产品的任务分发给具体的产品工厂。
 * 也就是定义一个抽象工厂，其定义了产品的生产接口，但不负责具体的产品，
 * 将生产任务交给不同的派生类工厂。这样不用通过指定类型来创建对象了
 * @ Modified By：
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory mifactory = new MiFactory();
        AbstractFactory applefacatory = new AppleFactory();
        mifactory.makePhone();
        applefacatory.makePhone();
    }

}
