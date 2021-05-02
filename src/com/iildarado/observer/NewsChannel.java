package com.iildarado.observer;

public class NewsChannel implements Channel{
    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}
