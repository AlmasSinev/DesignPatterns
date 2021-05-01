package com.iildarado.factory.abstract_factory.factories;

import com.iildarado.factory.abstract_factory.entities.Bank;
import com.iildarado.factory.enteties.Account;

public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Account getAccount(String accountType);
}
