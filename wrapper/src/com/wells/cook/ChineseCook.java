package com.wells.cook;

/**
 * 具体构件角色(Concrete Component)：定义一个将要接受附加责任的类
 */
public class ChineseCook implements Cook {

    @Override
    public void cook() {
        System.out.println("中国厨师做饭");
    }
}
