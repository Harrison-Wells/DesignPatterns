package com.wells.cook;

/**
 * ����װ�ν�ɫ(Concrete Decorator)�����������������ӵĹ��ܡ�
 */
public class HeadCook extends WrapperCook {

    public HeadCook(Cook cook) {
        this.cook=cook;
    }

    @Override
    public void cook() {
        System.out.println("������ϴͷ");
        cook.cook();
    }
}
