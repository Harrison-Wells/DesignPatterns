package com.wells;

public class Test {

    public static void main(String[] args){
        LazySingleton lazySingleton1=LazySingleton.getInstance();
        LazySingleton lazySingleton2=LazySingleton.getInstance();
        EagerSingleton eagerSingleton1= EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2= EagerSingleton.getInstance();

        if(lazySingleton1==lazySingleton2){
            System.out.println(lazySingleton1.toString());
            System.out.println(lazySingleton2.toString());
        }

        if(eagerSingleton1==eagerSingleton2){
            System.out.println(eagerSingleton1.toString());
            System.out.println(eagerSingleton2.toString());
        }
    }
}
