package com.wells.house;

public class AmericanStyle extends Renovation {

    public AmericanStyle(House house) {
        this.house=house;
    }

    @Override
    public void house() {
        super.house();
        System.out.println("装修成美式房子");
    }
}
