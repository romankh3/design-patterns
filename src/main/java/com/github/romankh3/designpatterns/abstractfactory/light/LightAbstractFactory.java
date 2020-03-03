package com.github.romankh3.designpatterns.abstractfactory.light;

import com.github.romankh3.designpatterns.abstractfactory.AbstractFactory;
import com.github.romankh3.designpatterns.abstractfactory.Alert;
import com.github.romankh3.designpatterns.abstractfactory.Button;

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
