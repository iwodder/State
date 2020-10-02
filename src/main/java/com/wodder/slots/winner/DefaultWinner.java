package com.wodder.slots.winner;

import java.util.Random;

/**
 * Default strategy that grants a winner approximately 1 in 10 tries.
 */
public class DefaultWinner implements WinnerStrategy {

    private final Random r;

    public DefaultWinner() {
        this.r = new Random();
    }

    @Override
    public boolean isWinner() {
        return (r.nextInt(10) == 9);
    }
}
