package com.iildarado.facade;

import com.iildarado.factory.enteties.Account;

public class TransferService {
    public static void transfer (int mount, Account fromAccount, Account toAccount){
        System.out.println("Transfering money");
    }
}
