package com.github.romankh3.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void shouldTestSingletonPattern() {
        //when
        Singleton singleton = Singleton.getINSTANCE();
        Singleton singleton2 = Singleton.getINSTANCE();

        //then
        assertEquals(singleton, singleton2);
    }

}
