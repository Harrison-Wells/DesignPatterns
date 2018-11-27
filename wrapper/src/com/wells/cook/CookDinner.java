package com.wells.cook;


public class CookDinner  {

    public static void main(String[] args){

        Cook hand=new HandCook(new ChineseCook());
        Cook head=new HeadCook(new HandCook(new ChineseCook()));
        hand.cook();
        head.cook();
    }
}
