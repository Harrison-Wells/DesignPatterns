package com.wells.sunny;

public class Sunny {

    public static void main(String[] args){

        Document document=new Approve(new LeaveRequest());
        document.display();
        Approve approve=new Approve(new LeaveRequest());
        approve.display();
        approve.approve();
    }
}
