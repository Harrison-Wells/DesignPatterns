package com.wells.cook;

/**
 * ���幹����ɫ(Concrete Component)������һ����Ҫ���ܸ������ε���
 */
public class ChineseCook implements Cook {

    @Override
    public void cook() {
        System.out.println("�й���ʦ����");
    }
}
