package com.zhj.app.factory;

import com.zhj.app.pojo.IPhone;
import com.zhj.app.pojo.MiPhone;
import com.zhj.app.pojo.Phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:03 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class PhoneFactory {
    public Phone makePhone(String phoneType){
        if (phoneType.equals("MiPhone")){
            return  new MiPhone();
        }else if (phoneType.equals("IPhone")){
            return new IPhone();
        }
        return null;
    }

}
