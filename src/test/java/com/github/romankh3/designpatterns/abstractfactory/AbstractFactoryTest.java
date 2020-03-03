package com.github.romankh3.designpatterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void shouldCreateLightFactory() {
        //when
        AbstractFactory factory = new LightAbstractFactory();

        //then
        assertTrue(factory.createAlert() instanceof LightAlert);
        assertTrue(factory.createButton() instanceof LightButton);
    }

    @Test
    public void shouldCreateDarkFactory() {
        //when
        AbstractFactory factory = new DarkAbstractFactory();

        //then
        assertTrue(factory.createButton() instanceof DarkButton);
        assertTrue(factory.createAlert() instanceof DarkAlert);
    }
}
