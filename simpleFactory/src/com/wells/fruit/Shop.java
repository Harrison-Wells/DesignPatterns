package com.wells.fruit;

/**
 * 商店  简单工厂模式的 水果工厂 factory
 */
public class Shop {

    public static Fruit sellFruit(String fruitName) throws Exception  {

       Class<?> c=Class.forName(fruitName);
       return (Fruit) c.newInstance();

    }
}
