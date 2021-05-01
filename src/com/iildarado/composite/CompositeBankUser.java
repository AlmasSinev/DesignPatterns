package com.iildarado.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankUser implements User{

    private List<User> childUsers = new ArrayList<User>();

    @Override
    public void userRole() {
        for (User account : childUsers) {
            account.userRole();
        }
    }
    // Добавляет счет в композицию
    public void add(User account) {
        childUsers.add(account);
    }
    // Удаляет счет из композиции
    public void remove(User account) {
        childUsers.remove(account);
    }
}

