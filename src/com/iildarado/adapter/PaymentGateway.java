package com.iildarado.adapter;

import com.iildarado.factory.enteties.Account;

public interface PaymentGateway {
    void doPayment(Account account1, Account account2);
}
