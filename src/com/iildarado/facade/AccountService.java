package com.iildarado.facade;

import com.iildarado.factory.enteties.Account;
import com.iildarado.factory.enteties.SavingAccount;

public class AccountService {
    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}
