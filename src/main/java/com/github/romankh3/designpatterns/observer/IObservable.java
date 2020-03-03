package com.github.romankh3.designpatterns.observer;

public interface IObservable {
    void add(IObserver observable);
    void remove(IObserver observable);
    void notifyObservers();
}
