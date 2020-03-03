package com.github.romankh3.designpatterns.command;

public class Invoker {

    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        on.execute();
    }

    public void clickOff() {
        off.execute();
    }

    public void clickDown() {
        down.execute();
    }

    public void clickUp() {
        up.execute();
    }

}
