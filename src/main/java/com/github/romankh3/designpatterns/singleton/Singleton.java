package com.github.romankh3.designpatterns.singleton;

/**
 * Singleton pattern is code smell, dueto the problem
 * with single responsibility. why?
 * 1. Make sure, that this is only one instance.
 * 2. Make sure, that this is globally available.
 * 3. Have own behaviour.
 */
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
