package com.wells.staticProxy;

public class Client {

    public static void main(String[] args){

        Host host=new Host();
        StaticProxy sp=new StaticProxy(host);
        sp.rent();

    }
}
