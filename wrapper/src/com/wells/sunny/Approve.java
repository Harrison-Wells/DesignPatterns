package com.wells.sunny;

public class Approve extends Decorator {

    public Approve(Document document) {
        super(document);
    }

    public void approve(){
        System.out.println("�����������ܣ�");
    }
}
