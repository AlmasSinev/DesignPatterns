package com.iildarado.bridge;

public class AudiAuto extends Auto{

    public AudiAuto (Account acc) {
        super(acc);
    }

    @Override
    Account openAccount() {
        System.out.print("Open your account with Audi auto ");
        return account;
    }
}
