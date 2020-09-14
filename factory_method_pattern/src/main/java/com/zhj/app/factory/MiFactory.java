package com.zhj.app.factory;

import com.zhj.app.pojo.MiPhone;
import com.zhj.app.pojo.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:20 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class MiFactory implements AbstractFactory {
    public Phone makePhone() {
        return new MiPhone();
    }
}
