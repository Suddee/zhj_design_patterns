package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 20:41 2020/9/24
 * @ Description：拉模式观察者模式
 * @ Modified By：
 * @Version:
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
        this.nodifyObservers();
    }
}
