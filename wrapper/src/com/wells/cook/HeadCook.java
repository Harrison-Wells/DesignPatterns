package com.wells.cook;

/**
 * 具体装饰角色(Concrete Decorator)：负责给构件添加增加的功能。
 */
public class HeadCook extends WrapperCook {

    public HeadCook(Cook cook) {
        this.cook=cook;
    }

    @Override
    public void cook() {
        System.out.println("做饭先洗头");
        cook.cook();
    }
}
