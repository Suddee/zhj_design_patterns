package com.zhj.app.deep;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 15:17 2020/9/28
 * @ Description：
 * @ Modified By：
 * @Version:
 */

class Field implements Cloneable{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    protected Field clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (Field) object;
    }

}
public class DeepPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;
    private Field field;

    public DeepPrototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.field = new Field();
        this.field.setA(5);
    }

    public Field getField() {
        return field;
    }

    @Override
    protected DeepPrototype clone() {
        Object object = null;
        try {
            object = super.clone();
            ((DeepPrototype)object).field = this.field.clone();
        } catch (CloneNotSupportedException exception) {
            System.out.println(exception.getMessage());
        }
        return (DeepPrototype) object;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field.getA() + "]";
    }

    public static void main(String[] args) {
        DeepPrototype prototype1 = new DeepPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getField());
        DeepPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype1==prototype2);//false
        System.out.println(prototype2.getField());
    }

}