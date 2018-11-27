package com.wells.sunny;

public class Approve extends Decorator {

    public Approve(Document document) {
        super(document);
    }

    public void approve(){
        System.out.println("增加审批功能！");
    }
}
