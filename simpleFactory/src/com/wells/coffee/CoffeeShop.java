package com.wells.coffee;

/**
 * ���ȵ�  �򵥹���ģʽ�Ŀ��ȹ���
 */
public class CoffeeShop {

    /**
     * ���ۿ���
     * @param coffeeName ���ۿ��ȵ�����
     * @return ���۵Ŀ���
     */
    public static Coffee  sellCoffee(String coffeeName){
        Coffee coffee=null;
        if(coffeeName.equalsIgnoreCase("Americano")){
            coffee=new Americano();
        }else if(coffeeName.equalsIgnoreCase("Cappuccino")){
            coffee=new Cappuccino();
        }else if(coffeeName.equalsIgnoreCase("Latte")){
            coffee=new Latte();
        }else{
            throw new RuntimeException("�Բ��𣬱���û��"+coffeeName+"����");
        }
        return coffee;
    }
}
