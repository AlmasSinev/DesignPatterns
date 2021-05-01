package com.iildarado.factory.abstract_factory.factories;

import com.iildarado.factory.abstract_factory.entities.Bank;
import com.iildarado.factory.enteties.Account;
import com.iildarado.factory.enteties.CurrentAccount;
import com.iildarado.factory.enteties.SavingAccount;

public class AccountFactory extends AbstractFactory{

    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    @Override
    Bank getBank(String bankName) {
        return null;
    }

    @Override
    Account getAccount(String accountType) {
        if (accountType.equals(CURRENT_ACCOUNT))
            return new CurrentAccount();
        else if (accountType.equals(SAVING_ACCOUNT))
                return new SavingAccount();
        return null;
    }
}
