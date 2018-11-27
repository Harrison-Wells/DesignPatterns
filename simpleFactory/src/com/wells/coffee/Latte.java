package com.wells.coffee;

/**
 * 拿铁咖啡
 */
public class Latte implements  Coffee {

    /**
     * 实现Coffe接口冲咖啡方法
     */
    @Override
    public void dashCoffee() {
        System.out.println("冲一杯拿铁咖啡");
    }
}
