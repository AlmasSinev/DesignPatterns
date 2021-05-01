package com.iildarado.prototype;

public class Main {
    public static void main(String[] args) {
        Account currentAccount = (Account)
                AccountCache.accountCacheMap.get("CURRENT").clone();
        currentAccount.accountType();
        Account savingAccount = (Account)
                AccountCache.accountCacheMap.get("SAVING") .clone();
        savingAccount.accountType();
    }
}