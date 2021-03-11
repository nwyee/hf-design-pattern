package me.note.strategy;

import me.note.strategy.behaviors.FlyWithWings;
import me.note.strategy.behaviors.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a mallard duck");
    }
}
