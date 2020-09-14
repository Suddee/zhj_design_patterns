package com.zhj.app.factory;

import com.zhj.app.pojo.pc.MiPC;
import com.zhj.app.pojo.pc.PC;
import com.zhj.app.pojo.phone.MiPhone;
import com.zhj.app.pojo.phone.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:36 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class XiaoMiFactory implements AbstractFactory {
    public Phone makePhone() {
        return new MiPhone();
    }

    public PC makePC() {
        return new MiPC();
    }
}
