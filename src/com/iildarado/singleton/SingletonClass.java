package com.iildarado.singleton;

public class SingletonClass {
    private static final SingletonClass INSTANCE
            = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance() {
        return INSTANCE;
    }
}
