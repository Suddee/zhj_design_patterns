package com.zhj.app.factory;

import com.zhj.app.pojo.pc.MAC;
import com.zhj.app.pojo.pc.PC;
import com.zhj.app.pojo.phone.IPhone;
import com.zhj.app.pojo.phone.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:37 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class AppleFactory implements AbstractFactory {
    public Phone makePhone() {
        return new IPhone();
    }

    public PC makePC() {
        return new MAC();
    }
}
