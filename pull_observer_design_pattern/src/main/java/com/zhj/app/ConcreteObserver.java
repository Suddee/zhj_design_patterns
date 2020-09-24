package com.zhj.app;


/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 20:40 2020/9/24
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class ConcreteObserver implements Observer{
    //观察者的状态
    private String observerState;


    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("观察者状态为："+observerState);
    }
}
