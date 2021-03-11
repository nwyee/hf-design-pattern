package me.note.strategy;

import me.note.strategy.behaviors.FlyWithWings;
import me.note.strategy.behaviors.Quack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I am a real red headed duck.");
    }
}
