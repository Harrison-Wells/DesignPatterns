package com.wells.dynamicProxy;

import com.wells.staticProxy.Host;
import com.wells.staticProxy.Rent;

public class Client {

    public static void main(String[] args){
        Student student=new Student();
        DynamicProxy dy=new DynamicProxy(student);
        Study proxy1= (Study) dy.getProxy();
        proxy1.study();

        Host host=new Host();
        DynamicProxy dp=new DynamicProxy(host);
        Rent proxy2=(Rent) dp.getProxy();
        proxy2.rent();

    }
}
