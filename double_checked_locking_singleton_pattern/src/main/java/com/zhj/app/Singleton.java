package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 14:35 2020/9/16
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null ){
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
