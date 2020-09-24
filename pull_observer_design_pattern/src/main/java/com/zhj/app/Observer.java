package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 20:40 2020/9/24
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public interface  Observer {
    /**
     * 更新接口
     * @param subject 传入主题对象，方面获取相应的主题对象的状态
     */
    public void update(Subject subject);
}
