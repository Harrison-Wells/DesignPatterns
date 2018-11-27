package com.wells.coffee;

/**
 * 咖啡店  简单工厂模式的咖啡工厂
 */
public class CoffeeShop {

    /**
     * 出售咖啡
     * @param coffeeName 出售咖啡的名字
     * @return 出售的咖啡
     */
    public static Coffee  sellCoffee(String coffeeName){
        Coffee coffee=null;
        if(coffeeName.equalsIgnoreCase("Americano")){
            coffee=new Americano();
        }else if(coffeeName.equalsIgnoreCase("Cappuccino")){
            coffee=new Cappuccino();
        }else if(coffeeName.equalsIgnoreCase("Latte")){
            coffee=new Latte();
        }else{
            throw new RuntimeException("对不起，本店没有"+coffeeName+"咖啡");
        }
        return coffee;
    }
}
