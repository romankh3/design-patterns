package com.github.romankh3.designpatterns.command.commands;

import com.github.romankh3.designpatterns.command.ICommand;
import com.github.romankh3.designpatterns.command.Light;

public class LightUpCommand implements ICommand {

    private Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void unexecute() {
        light.down();
    }
}
