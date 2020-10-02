package com.wodder.slots;

import com.wodder.slots.states.NoToken;
import com.wodder.slots.states.NoWinner;
import com.wodder.slots.states.SlotState;
import com.wodder.slots.states.Token;
import com.wodder.slots.states.Winner;

public class SlotMachine {

    private final SlotState noTokenState;
    private final SlotState tokenState;
    private final SlotState winnerState;
    private final SlotState noWinnerState;

    private SlotState thisState;
    private int numberOfPlays;
    private int numberOfWins;

    public SlotMachine() {
        this.noTokenState = new NoToken(this);
        this.tokenState = new Token(this);
        this.winnerState = new Winner(this);
        this.noWinnerState = new NoWinner(this);

        thisState = noTokenState;
    }

    public void insertToken(){
        thisState.insertToken();
    }

    public void pullLever() {
        thisState.pullLever();
    }

    public void payout() {
        thisState.payout();
    }

    public void incNumberOfPlays() {
        numberOfPlays++;
    }

    public void incNumberOfWins() {
        numberOfWins++;
    }

    public double getWinPercent() {
        return (((double) numberOfWins) / numberOfPlays) * 100.0;
    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setThisState(SlotState thisState) {
        this.thisState = thisState;
    }

    public SlotState getNoTokenState() {
        return noTokenState;
    }

    public SlotState getTokenState() {
        return tokenState;
    }

    public SlotState getWinnerState() {
        return winnerState;
    }

    public SlotState getNoWinnerState() {
        return noWinnerState;
    }
}
