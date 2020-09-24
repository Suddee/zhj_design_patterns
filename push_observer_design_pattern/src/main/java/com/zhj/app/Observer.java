package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 20:35 2020/9/24
 * @ Description：抽象观察者角色类,java有一个和这类似的接口
 * @ Modified By：
 * @Version:
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
