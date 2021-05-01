package com.iildarado.bridge;

public class SaveAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("SAVE ACCOUNT");
    }

    @Override
    public Account openAccount() {
        System.out.println("OPENED : SAVE ACCOUNT");
        return new SaveAccount();
    }
}
