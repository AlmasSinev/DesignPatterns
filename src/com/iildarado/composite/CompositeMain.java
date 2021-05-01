package com.iildarado.composite;

public class CompositeMain {
    public static void main(String[] args) {
        SimpleUser simpleUser1 = new SimpleUser();
        SimpleUser simpleUser2 = new SimpleUser();

        AdminUser adminUser1 = new AdminUser();
        AdminUser adminUser2 = new AdminUser();

        CompositeBankUser compositeBankUser1 = new CompositeBankUser();
        CompositeBankUser compositeBankUser2 = new CompositeBankUser();
        CompositeBankUser compositeBankUser = new CompositeBankUser();

        compositeBankUser1.add(simpleUser1);
        compositeBankUser1.add(adminUser1);
        compositeBankUser2.add(simpleUser2);
        compositeBankUser2.add(adminUser2);

        compositeBankUser.add(compositeBankUser1);
        compositeBankUser.add(compositeBankUser2);
        compositeBankUser.userRole();
    }
}
