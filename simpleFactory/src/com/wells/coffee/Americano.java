package com.wells.coffee;

/**
 * 美式咖啡
 */
public class Americano implements Coffee {

    /**
     * 实现Coffee接口的冲咖啡方法
     */
    @Override
    public void dashCoffee() {
        System.out.println("冲一杯美式咖啡");
    }
}
