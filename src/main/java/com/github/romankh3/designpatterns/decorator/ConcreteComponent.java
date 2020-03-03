package com.github.romankh3.designpatterns.decorator;

public class ConcreteComponent implements Component {
    @Override
    public int calculateCost() {
        return 1;
    }
}
