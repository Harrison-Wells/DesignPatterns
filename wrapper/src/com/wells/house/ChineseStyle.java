package com.wells.house;

public class ChineseStyle extends Renovation {

    public ChineseStyle(House house) {
        this.house=house;
    }

    @Override
    public void house() {
        super.house();
        System.out.println("装修成中式房子");
    }
}
