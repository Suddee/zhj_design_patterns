package com.zhj.app.pojo.pc;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:33 2020/9/14
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class MiPC implements PC{
    public MiPC(){
        this.make();
    }
    public void make() {
        System.out.println("make  xiaomi pc");
    }
}
