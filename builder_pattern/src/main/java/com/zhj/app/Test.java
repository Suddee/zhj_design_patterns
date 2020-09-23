package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:32 2020/9/23
 * @ Description：第一种构造者模式
 * 1、创建抽象建造者定义造房步骤
 *
 * 2、创建工人具体实现造房步骤
 *
 * 3、创建承包商指挥工人施工
 *
 * 4、验收，检查是否建造完成
 * @ Modified By：
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }
}
