package com.github.romankh3.designpatterns.decorator;

public class DoubleDecorator extends Decorator {

    public DoubleDecorator(Component component) {
        super(component);
    }

    @Override
    public int calculateCost() {
        return super.calculateCost() * 2;
    }
}
