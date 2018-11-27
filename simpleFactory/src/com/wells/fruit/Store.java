package com.wells.fruit;

public class Store {

    public static Fruit sellFruit1(Class<?> c) throws Exception {

        Fruit fruit= (Fruit) c.newInstance();
        return fruit;
    }

    public static Fruit sellFruit2() throws Exception {

        return new Banana();
    }


}
