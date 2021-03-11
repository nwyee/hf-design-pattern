package me.note.strategy;

import me.note.strategy.behaviors.FlyBehavior;
import me.note.strategy.behaviors.FlyNoWay;
import me.note.strategy.behaviors.QuackBehavior;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cntFly = () -> System.out.println(" I can't fly ");
        QuackBehavior squeak = () -> System.out.println("<< Squeak >>");
        RubberDuck rubberDuck = new RubberDuck(cntFly,squeak);

        mallard.performQuack();
        rubberDuck.performQuack();

        Duck model = new RedHeadDuck();
        model.performFly();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();
    }
}
