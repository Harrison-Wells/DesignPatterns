package com.wells.staticProxy;

public class StaticProxy implements Rent{

    private Host host;

    public StaticProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        payRent();
    }


    private  void seeHouse(){
        System.out.println("¿´·¿");
    }

    private void payRent(){
        System.out.println("¸¶Ç®");
    }

}
