package com.wells.house;

public class Host {

    public static void main(String[] args){

        House chinese =new ChineseStyle(new RoughHouse());
        chinese.house();
        House american=new AmericanStyle(new RoughHouse());
        american.house();
        House renovation=new Renovation(new RoughHouse());
        renovation.house();
    }
}
