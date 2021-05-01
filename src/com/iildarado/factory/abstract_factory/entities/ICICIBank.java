package com.iildarado.factory.abstract_factory.entities;

public class ICICIBank  implements Bank{
    @Override
    public void bankName() {
        System.out.println("ICICI BANK");
    }
}
