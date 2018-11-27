package com.wells.cook;

/**
 * 装饰角色(Decorator)：持有一个构建对象的实例，并定义一个与抽象构件接口一致的接口
 */
public abstract class WrapperCook implements Cook {

    protected Cook cook;



}
