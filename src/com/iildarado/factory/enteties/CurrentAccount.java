package com.iildarado.factory.enteties;

public class CurrentAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
