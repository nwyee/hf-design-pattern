package me.note.observer.weather.observer;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
