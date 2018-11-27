package com.wells.fruit;

import com.wells.coffee.Banana;


public class Test {

    public static void main(String[] args) throws Exception {

        Fruit apple =Shop.sellFruit(FruitPath.Apple);
        apple.fruitName();

        Fruit banana =Shop.sellFruit(FruitPath.Banana);
        banana.fruitName();


        System.out.println("-------------------------");
        Fruit banana1 =Store.sellFruit1(Banana.class);
        banana1.fruitName();

        Fruit banana2 =Store.sellFruit2();
        banana2.fruitName();




    }
}
