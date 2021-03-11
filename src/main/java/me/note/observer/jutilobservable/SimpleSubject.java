package me.note.observer.jutilobservable;


import java.util.Observable;

public class SimpleSubject extends Observable {
    private int value;

    public SimpleSubject(int value) {
        this.value = value;
    }

    public SimpleSubject() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    public int getValue() {
        return this.value;
    }
}
