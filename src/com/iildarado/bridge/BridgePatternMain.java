package com.iildarado.bridge;

public class BridgePatternMain {
    public static void main(String[] args) {

        Auto audi = new AudiAuto(new CurrAccount());
        Account currAcc = audi.openAccount();
        currAcc.accountType();

        Auto kia = new KiaAuto(new SaveAccount());
        Account saveAcc = kia.openAccount();
        saveAcc.accountType();

    }
}
