package com.iildarado.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {
    public static Map<String, Account> accountCacheMap = new HashMap<>();

    static {
        Account currentAccount = new CurrentAccount();
        Account savingAccount = new SavingAccount();
        accountCacheMap.put("SAVING", savingAccount);
        accountCacheMap.put("CURRENT", currentAccount);
    }
}
