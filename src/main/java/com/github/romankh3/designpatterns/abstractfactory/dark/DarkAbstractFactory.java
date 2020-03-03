package com.github.romankh3.designpatterns.abstractfactory.dark;

import com.github.romankh3.designpatterns.abstractfactory.AbstractFactory;
import com.github.romankh3.designpatterns.abstractfactory.Alert;
import com.github.romankh3.designpatterns.abstractfactory.Button;

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
