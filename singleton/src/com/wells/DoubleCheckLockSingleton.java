package com.wells;

public class DoubleCheckLockSingleton {

    private static DoubleCheckLockSingleton doubleCheckLockSingleton=null;

    private DoubleCheckLockSingleton(){}

    private static DoubleCheckLockSingleton getInstance(){

        if(doubleCheckLockSingleton==null){

            synchronized (DoubleCheckLockSingleton.class){
                if(doubleCheckLockSingleton==null){

                        doubleCheckLockSingleton=new DoubleCheckLockSingleton();
                }

            }

        }
        return doubleCheckLockSingleton;
    }
}
