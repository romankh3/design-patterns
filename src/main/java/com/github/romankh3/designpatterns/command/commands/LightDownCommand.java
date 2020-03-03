package com.github.romankh3.designpatterns.command.commands;

import com.github.romankh3.designpatterns.command.ICommand;
import com.github.romankh3.designpatterns.command.Light;

public class LightDownCommand implements ICommand {

    private Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void unexecute() {
        light.up();
    }
}
