package com.iildarado.bridge;

public class CurrAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("CURR ACCOUNT");
    }

    @Override
    public Account openAccount() {
        System.out.println("OPENED : CURR ACCOUNT");
        return new CurrAccount();
    }
}
