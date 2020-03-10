package com.github.romankh3.designpatterns.adapter.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositionAdapterTest {

    @Test
    public void shouldAdapterWork() {
        //given
        Client client = new Client(new Adapter(new Adaptee()));

        //when
        String adapted = client.doSmth("request");

        //then
        Assertions.assertEquals("request", adapted);
    }
}
