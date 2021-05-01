package com.iildarado.factory.abstract_factory.entities;

public class YesBank implements Bank{
    @Override
    public void bankName() {
        System.out.println("YES BANK");
    }
}
