package me.note.observer.simple;

public interface Subject {
     void registerObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObserver();
}
