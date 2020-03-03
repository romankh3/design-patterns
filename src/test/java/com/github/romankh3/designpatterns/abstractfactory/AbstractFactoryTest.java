package com.github.romankh3.designpatterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.romankh3.designpatterns.abstractfactory.dark.DarkAbstractFactory;
import com.github.romankh3.designpatterns.abstractfactory.dark.DarkAlert;
import com.github.romankh3.designpatterns.abstractfactory.dark.DarkButton;
import com.github.romankh3.designpatterns.abstractfactory.light.LightAbstractFactory;
import com.github.romankh3.designpatterns.abstractfactory.light.LightAlert;
import com.github.romankh3.designpatterns.abstractfactory.light.LightButton;
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
