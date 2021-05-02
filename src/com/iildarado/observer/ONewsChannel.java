package com.iildarado.observer;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {

    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Observable observable, Object o) {
        this.setNews((String) o);
    }
}
