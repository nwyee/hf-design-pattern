package me.note.observer.simple;

import java.util.ArrayList;

public class SimpleSubject implements Subject{
    private ArrayList<Observer> observerList;
    private int value = 0;

    public SimpleSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observerList) {
            o.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
