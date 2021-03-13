package me.note.decorator;

public abstract class Beverage {
    public enum Size {SMALL, TALL, GRANDE, VENTI};
    Size size = Size.SMALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
