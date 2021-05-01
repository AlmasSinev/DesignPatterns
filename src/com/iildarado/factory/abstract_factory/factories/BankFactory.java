package com.iildarado.factory.abstract_factory.factories;

import com.iildarado.factory.abstract_factory.entities.Bank;
import com.iildarado.factory.abstract_factory.entities.ICICIBank;
import com.iildarado.factory.abstract_factory.entities.YesBank;
import com.iildarado.factory.enteties.Account;

public class BankFactory extends AbstractFactory{

    final String ICICI_BANK = "ICICI";
    final String YES_BANK = "YES";

    @Override
    Bank getBank(String bankName) {
        if (bankName.equals(ICICI_BANK))
            return new ICICIBank();
        else if (bankName.equals(YES_BANK))
            return new YesBank();
        return null;
    }

    @Override
    Account getAccount(String accountType) {
        return null;
    }
}
