package com.github.romankh3.designpatterns.abstractfactory;

public class LightAbstractFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Alert createAlert() {
        return new LightAlert();
    }
}
