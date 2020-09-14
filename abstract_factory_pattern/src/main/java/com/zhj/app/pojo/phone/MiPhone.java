package com.zhj.app.pojo.phone;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 12:59 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class MiPhone implements Phone{

    public MiPhone(){
        this.make();
    }

    public void make() {
        System.out.println("make mi phone");
    }
}
