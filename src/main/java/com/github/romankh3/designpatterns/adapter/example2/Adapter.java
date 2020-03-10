package com.github.romankh3.designpatterns.adapter.example2;

public class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request(String request) {
        return adaptee.specificRequest(request);
    }
}
