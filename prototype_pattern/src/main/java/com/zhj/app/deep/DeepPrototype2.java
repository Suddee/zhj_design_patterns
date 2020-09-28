package com.zhj.app.deep;

import java.io.*;

/**
 * @ Author     ：zhj.
 * @ Date       ：Created in 17:30 2020/9/28
 * @ Description：采用序列化进行深度克隆
 * @ Modified By：
 * @Version:
 */

class Field1 implements Cloneable, Serializable {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //浅克隆
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

    public  Object deepClone() throws Exception{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
public class DeepPrototype2 implements Serializable{
    private int x;
    private int y;
    private int z;
    private Field1 field1;

    public DeepPrototype2() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.field1 = new Field1();
        this.field1.setA(5);
    }

    public Field1 getField() {
        return field1;
    }

    public  Object deepClone() throws Exception{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field1.getA() + "]";
    }

    public static void main(String[] args) throws Exception {
        DeepPrototype2 prototype1 = new DeepPrototype2();
        System.out.println(prototype1);
        System.out.println(prototype1.getField());
        DeepPrototype2 prototype2 = (DeepPrototype2) prototype1.deepClone();
        System.out.println(prototype2);
        System.out.println(prototype1==prototype2);//false
        System.out.println(prototype2.getField());
    }
}
