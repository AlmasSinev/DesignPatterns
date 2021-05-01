package com.iildarado.decorator;

public class DecoratorMain {
    public static void main(String[] args) {

        /* Сберегательный счет без декорации */
        Account basicSavingAccount = new SavingAccount();
        System.out.println(basicSavingAccount.getTotalBenefits());

        /* Сберегательный счет с декорацией в виде акционной схемы
            для пенсионеров */
        Account seniorCitizenSavingAccount = new SavingAccount();
        seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());

        /* Сберегательный счет с декорацией в виде акционной схемы
            для VIP-вкладчиков */
        Account privilegeCitizenSavingAccount = new SavingAccount();
        privilegeCitizenSavingAccount = new Privilege(privilegeCitizenSavingAccount);
        System.out.println(privilegeCitizenSavingAccount.getTotalBenefits());
    }
}
