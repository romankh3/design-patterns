package com.github.romankh3.designpatterns.adapter.example1.round;

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Show can be plug in {@link RoundPeg} into {@link RoundHole}.
     *
     * @param peg {@link RoundPeg} object to be plugin.
     * @return boolean value.
     */
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
