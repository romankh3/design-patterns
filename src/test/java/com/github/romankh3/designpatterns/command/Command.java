package com.github.romankh3.designpatterns.command;

import com.github.romankh3.designpatterns.command.commands.LightDownCommand;
import com.github.romankh3.designpatterns.command.commands.LightOffCommand;
import com.github.romankh3.designpatterns.command.commands.LightOnCommand;
import com.github.romankh3.designpatterns.command.commands.LightUpCommand;
import org.junit.jupiter.api.Test;

public class Command {

    @Test
    public void shouldTestCommand() {
        Light light = new Light();

        Invoker invoker = new Invoker(new LightOnCommand(light), new LightOffCommand(light), new LightUpCommand(light),
                new LightDownCommand(light));


        invoker.clickOn();
        invoker.clickOff();
        invoker.clickUp();
        invoker.clickDown();
    }

}
