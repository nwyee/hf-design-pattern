package me.note.observer.weather.subject;

import me.note.observer.weather.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
