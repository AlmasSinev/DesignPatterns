package com.iildarado.bridge;

public class KiaAuto extends Auto{

    public KiaAuto(Account  acc) {
        super(acc);
    }

    @Override
    Account openAccount() {
        System.out.print("Open your account with Kia auto ");
        return account;
    }
}
