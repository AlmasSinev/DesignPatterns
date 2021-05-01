package com.iildarado.bridge;

public abstract class Auto {
    protected Account account;
    public Auto(Account acc){
        this.account = acc;
    }
    abstract Account openAccount();
}
