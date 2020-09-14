package com.zhj.app.pojo.phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:01 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class IPhone implements Phone {
    public IPhone(){
        this.make();
    }

    public void make() {
        System.out.println("make iphone");
    }
}
