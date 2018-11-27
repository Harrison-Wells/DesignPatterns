package com.wells.coffee;

public class Test {

    public static void main(String[] args){
        Coffee Latte=CoffeeShop.sellCoffee("Latte");
        Latte.dashCoffee();

        Coffee Americano =CoffeeShop.sellCoffee("Americano");
        Americano.dashCoffee();

        Coffee Cappuccino =CoffeeShop.sellCoffee("Cappuccino");
        Cappuccino.dashCoffee();


    }
}
