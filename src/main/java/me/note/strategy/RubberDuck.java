package me.note.strategy;

import me.note.strategy.behaviors.FlyBehavior;
import me.note.strategy.behaviors.FlyNoWay;
import me.note.strategy.behaviors.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duck");
    }
}
