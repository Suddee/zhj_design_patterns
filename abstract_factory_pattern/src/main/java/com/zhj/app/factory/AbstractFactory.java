package com.zhj.app.factory;

import com.zhj.app.pojo.pc.PC;
import com.zhj.app.pojo.phone.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:35 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
