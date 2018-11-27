package com.wells.fruit;

/**
 * 具体实现类 香蕉
 */
public class Banana  implements  Fruit{

    /**
     * 实现接口方法 获取水果名字
     */
    @Override
    public void fruitName() {
        System.out.println("香蕉");
    }
}
