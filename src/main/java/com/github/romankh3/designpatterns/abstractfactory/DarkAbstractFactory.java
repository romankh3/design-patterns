package com.github.romankh3.designpatterns.abstractfactory;

public class DarkAbstractFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Alert createAlert() {
        return new DarkAlert();
    }
}
