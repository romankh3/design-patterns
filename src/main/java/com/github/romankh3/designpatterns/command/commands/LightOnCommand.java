package com.github.romankh3.designpatterns.command.commands;

import com.github.romankh3.designpatterns.command.ICommand;
import com.github.romankh3.designpatterns.command.Light;

public class LightOnCommand implements ICommand {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unexecute() {
        light.off();
    }
}
