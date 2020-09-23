package com.zhj.app;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 13:27 2020/9/23
 * @ Description：具体建造者
 * @ Modified By：
 * @Version:
 */
public class ConcreteBuilder implements Builder{
    private Product product;

    public ConcreteBuilder(){
        product = new Product();
    }


    public void bulidA() {
        product.setBuildA("地基");
    }

    public void bulidB() {
        product.setBuildB("钢筋工程");
    }

    public void bulidC() {
        product.setBuildC("铺电线");

    }

    public void bulidD() {
        product.setBuildD("粉刷");
    }

    public Product getProduct() {
        return product;
    }
}
