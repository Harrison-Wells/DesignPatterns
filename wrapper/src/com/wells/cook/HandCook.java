package com.wells.cook;

/**
 * ����װ�ν�ɫ(Concrete Decorator)�����������������ӵĹ��ܡ�
 */
public class HandCook extends WrapperCook {

    public HandCook(Cook cook) {
        this.cook=cook;
    }

    @Override
    public void cook() {
        System.out.println("������ϴ��");
        cook.cook();
    }
}
