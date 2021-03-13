package me.note.decorator;

public class StarbuzzCoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $" + String.format("%.2f", beverage.cost()));
        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(Beverage.Size.TALL);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);

        System.out.println(darkRoast.getDescription()+" $" + String.format("%.2f", darkRoast.cost()));
    }
}
