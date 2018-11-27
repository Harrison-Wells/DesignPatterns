package com.wells.cook;

/**
 * 具体装饰角色(Concrete Decorator)：负责给构件添加增加的功能。
 */
public class HandCook extends WrapperCook {

    public HandCook(Cook cook) {
        this.cook=cook;
    }

    @Override
    public void cook() {
        System.out.println("做饭先洗手");
        cook.cook();
    }
}
