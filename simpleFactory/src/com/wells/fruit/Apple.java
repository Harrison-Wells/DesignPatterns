package com.wells.fruit;

/**
 * 具体实现类 苹果
 */
public class Apple implements  Fruit{
    /**
     * 实现接口方法 获取水果名字
     */
    @Override
    public void fruitName() {
        System.out.println("苹果");
    }
}
