package com.github.romankh3.designpatterns.decorator;

public class Plus5Decorator extends Decorator {

    public Plus5Decorator(Component component) {
        super(component);
    }

    @Override
    public int calculateCost() {
        return super.calculateCost() + 5;
    }
}
