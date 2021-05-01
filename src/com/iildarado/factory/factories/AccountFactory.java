package com.iildarado.factory.factories;

import com.iildarado.factory.enteties.Account;
import com.iildarado.factory.enteties.CurrentAccount;
import com.iildarado.factory.enteties.SavingAccount;

public class AccountFactory {
    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    public Account getAccount (String accountType){
        if (accountType.equals(CURRENT_ACCOUNT))
            return new CurrentAccount();
        else if (accountType.equals(SAVING_ACCOUNT))
            return new SavingAccount();

        return null;
    }
}
