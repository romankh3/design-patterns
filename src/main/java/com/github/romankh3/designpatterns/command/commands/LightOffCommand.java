package com.github.romankh3.designpatterns.command.commands;

import com.github.romankh3.designpatterns.command.ICommand;
import com.github.romankh3.designpatterns.command.Light;

public class LightOffCommand implements ICommand {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unexecute() {
        light.on();
    }
}
