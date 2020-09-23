package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:42 2020/9/23
 * @ Description：
 * @ Modified By：
 * @Version:
 */
public class ConcreteBuilder implements Builder {
    private Product product;
    public ConcreteBuilder() {
        product = new Product();
    }


    public Product build() {
        return product;
    }


    public Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }


    public Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }


    public Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }


    public Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
}
