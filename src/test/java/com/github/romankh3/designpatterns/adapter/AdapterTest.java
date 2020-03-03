package com.github.romankh3.designpatterns.adapter;

import com.github.romankh3.designpatterns.adapter.example1.SquarePegAdapter;
import com.github.romankh3.designpatterns.adapter.example1.round.RoundHole;
import com.github.romankh3.designpatterns.adapter.example1.square.SquarePeg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void shouldAdaptExample2() {
        //given
        RoundHole roundHole = new RoundHole(2.0);
        SquarePeg squarePeg = new SquarePeg(2.0);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        //when-then
        Assertions.assertTrue(roundHole.fits(adapter));
    }
}
