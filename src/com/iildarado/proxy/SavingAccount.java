package com.iildarado.proxy;

public class SavingAccount implements Account{

    @Override
    public void accountType() {
        System.out.println("SAVING ");
    }
}