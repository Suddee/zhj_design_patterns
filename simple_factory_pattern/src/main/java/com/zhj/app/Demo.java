package com.zhj.app;

import com.zhj.app.factory.PhoneFactory;
import com.zhj.app.pojo.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:05 2020/9/14
 * @ Description：简单工厂模式，允许接口创建对象，但不会暴露对象的创建逻辑
 * @ Modified By：
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("MiPhone");
        Phone iphone = factory.makePhone("IPhone");
    }
}
