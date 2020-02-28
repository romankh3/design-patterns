package com.github.romankh3.designpatterns.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void shouldCreateLightFactory() {
        //when
        AbstractFactory factory = new LightAbstractFactory();

        //then
        Assert.assertTrue(factory.createAlert() instanceof LightAlert);
        Assert.assertTrue(factory.createButton() instanceof LightButton);
    }

    @Test
    public void shouldCreateDarkFactory() {
        //when
        AbstractFactory factory = new DarkAbstractFactory();

        //then
        Assert.assertTrue(factory.createButton() instanceof DarkButton);
        Assert.assertTrue(factory.createAlert() instanceof DarkAlert);
    }
}
