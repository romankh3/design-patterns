package com.github.romankh3.designpatterns.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void shouldDecoratorWork() {
        Component component = new ConcreteComponent();

        Decorator decorator = new Decorator(component);

        Decorator plus5Decorator = new Plus5Decorator(decorator);

        Decorator doublePlus5Decorator = new DoubleDecorator(plus5Decorator);

        assertEquals(12, doublePlus5Decorator.calculateCost());
    }

}