package com.iildarado.factory.abstract_factory;

import com.iildarado.factory.abstract_factory.factories.AbstractFactory;
import com.iildarado.factory.abstract_factory.factories.AccountFactory;
import com.iildarado.factory.abstract_factory.factories.BankFactory;

public class FactoryProducer {

    final static String BANK = "BANK";
    final static String ACCOUNT = "ACCOUNT";

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase(BANK))
            return new BankFactory();
        else if (factory.equalsIgnoreCase(ACCOUNT))
            return new AccountFactory();
        return null;
    }
}
