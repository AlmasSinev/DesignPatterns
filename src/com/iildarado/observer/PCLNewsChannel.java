package com.iildarado.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel  implements PropertyChangeListener {

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.setNews((String) propertyChangeEvent.getNewValue());
    }
}
