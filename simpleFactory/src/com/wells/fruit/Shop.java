package com.wells.fruit;

/**
 * �̵�  �򵥹���ģʽ�� ˮ������ factory
 */
public class Shop {

    public static Fruit sellFruit(String fruitName) throws Exception  {

       Class<?> c=Class.forName(fruitName);
       return (Fruit) c.newInstance();

    }
}
