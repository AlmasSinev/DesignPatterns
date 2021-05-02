package com.iildarado.observer;

public class ClientMain {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        //assertEquals(observer.getNews(), "news");

        ONewsAgency observable2 = new ONewsAgency();
        ONewsChannel observer2 = new ONewsChannel();

        observable2.addObserver(observer2);
        observable2.setNews("news");
        //assertEquals(observer2.getNews(), "news");
    }
}
