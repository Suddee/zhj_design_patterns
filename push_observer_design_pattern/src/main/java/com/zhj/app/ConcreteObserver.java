package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 20:37 2020/9/24
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("状态为："+observerState);
    }
}
