package me.note.observer.jutilobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * The Observable class and the Observer interface have been deprecated in Java 9
 * because the event model supported by Observer and Observable is quite limited,
 * the order of notifications delivered by Observable is unspecified,
 * and state changes are not in one-for-one correspondence with notifications.
 */

public class SimpleObserver implements Observer {

    private int value;
    private Observable observable;

    public SimpleObserver(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void display() {
        System.out.println("Value : " + value);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        this.value = (int) arg;
        display();
        if( o instanceof SimpleSubject){
            SimpleSubject simpleSubject = (SimpleSubject) o;
            this.value = simpleSubject.getValue();
            display();
        }
    }
}
