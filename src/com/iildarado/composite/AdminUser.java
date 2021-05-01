package com.iildarado.composite;

public class AdminUser implements User{
    @Override
    public void userRole() {
        System.out.println("Admin user. ");
    }
}
