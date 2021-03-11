package me.note.observer.simple;

public class Simulator {
    public static void main(String[] args) {
        SimpleSubject sub = new SimpleSubject();
        SimpleObserver obs = new SimpleObserver(sub);
        SimpleObserver obs2 = new SimpleObserver(sub);
        sub.setValue(80);
        sub.removeObserver(obs);
        sub.removeObserver(obs2);
    }
}
