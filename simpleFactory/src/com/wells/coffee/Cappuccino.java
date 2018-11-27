package com.wells.coffee;

/**
 * 卡布奇诺咖啡
 */
public class Cappuccino  implements Coffee{

    /**
     * 实现Coffee接口冲咖啡方法
     */
    @Override
    public void dashCoffee() {
        System.out.println("冲一杯卡布奇诺咖啡");
    }
}
