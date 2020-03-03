package com.github.romankh3.designpatterns.observer;

public class ConcreteObserver implements IObserver {

    private final ConcreteObservable observable;

    public ConcreteObserver(ConcreteObservable concreteObservable) {
        this.observable = concreteObservable;
    }

    private String state;

    @Override
    public void update() {
        this.state = observable.getState();
    }

    public String getState() {
        return state;
    }
}
