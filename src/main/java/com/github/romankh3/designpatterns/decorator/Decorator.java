package com.github.romankh3.designpatterns.decorator;

public class Decorator implements Component {

    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public int calculateCost() {
        return this.component.calculateCost();
    }
}
