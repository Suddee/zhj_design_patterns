package com.zhj.app.factory;

import com.zhj.app.pojo.IPhone;
import com.zhj.app.pojo.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:22 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class AppleFactory implements AbstractFactory {
    public Phone makePhone() {
        return new IPhone();
    }
}
