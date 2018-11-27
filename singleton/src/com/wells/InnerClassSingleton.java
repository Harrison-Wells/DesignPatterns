package com.wells;

public class InnerClassSingleton {

    private static class InnerClass{
        private static InnerClassSingleton innerClassSingleton=new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return InnerClass.innerClassSingleton;
    }

}
