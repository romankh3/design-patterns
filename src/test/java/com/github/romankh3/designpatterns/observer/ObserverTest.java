package com.github.romankh3.designpatterns.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void shouldTestObserverPattern() {
        //given
        ConcreteObservable observable = new ConcreteObservable();

        ConcreteObserver observer1 = new ConcreteObserver(observable);
        ConcreteObserver observer2 = new ConcreteObserver(observable);
        ConcreteObserver observer3 = new ConcreteObserver(observable);

        //and register observers
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        //when
        observable.setState("NEW_STATE");

        //then
        Assertions.assertEquals(observable.getState(), observer1.getState());
        Assertions.assertEquals(observable.getState(), observer2.getState());
        Assertions.assertEquals(observable.getState(), observer3.getState());
    }

}
