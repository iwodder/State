package com.wodder.slots.states;

import com.wodder.slots.SlotMachine;
import com.wodder.slots.winner.DefaultWinner;
import com.wodder.slots.winner.WinnerStrategy;

import java.security.SecureRandom;

public class Token implements SlotState {

  private final SlotMachine slotMachine;
  private final SecureRandom random = new SecureRandom();
  private WinnerStrategy strategy;

  public Token(SlotMachine slotMachine) {
    this.slotMachine = slotMachine;
    this.strategy = new DefaultWinner();
  }

  @Override
  public void insertToken() {
    System.out.println("Already have your money, pull the lever to win!");
  }

  @Override
  public void pullLever() {
    slotMachine.incNumberOfPlays();
    if (strategy.isWinner()) {
      slotMachine.setThisState(slotMachine.getWinnerState());
    } else {
      slotMachine.setThisState(slotMachine.getNoWinnerState());
    }
  }

  @Override
  public void payout() {
    System.out.println("Cannot pay anything until I know you're a winner.");
  }
}
