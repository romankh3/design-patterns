package com.github.romankh3.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements IObservable {

    private String state = "OLD_STATE";

    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void add(IObserver observable) {
        observers.add(observable);
    }

    @Override
    public void remove(IObserver observable) {
        observers.remove(observable);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
