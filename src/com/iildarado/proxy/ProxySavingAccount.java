package com.iildarado.proxy;

public class ProxySavingAccount implements Account{

    private SavingAccount savingAccount;

    @Override
    public void accountType() {
        if(savingAccount == null){
            savingAccount = new SavingAccount();
        }
        savingAccount.accountType();
    }
}
