package com.wells.house;

public class Renovation implements House {

    protected House house;

    public Renovation(House house) {
        this.house = house;
    }

    public Renovation() {

    }

    @Override
    public void house() {
        house.house();
    }
}
