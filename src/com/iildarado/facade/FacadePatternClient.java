package com.iildarado.facade;

public class FacadePatternClient {
    public static void main(String[] args) {
        BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
        serviceFacade.moneyTransfer();
    }
}
