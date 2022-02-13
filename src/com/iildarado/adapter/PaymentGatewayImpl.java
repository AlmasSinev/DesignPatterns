package com.iildarado.adapter;

import com.iildarado.factory.enteties.Account;

public class PaymentGatewayImpl implements PaymentGateway{

    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
