package com.wodder.slots.states;

import com.wodder.slots.SlotMachine;

public class NoToken implements SlotState {

  private final SlotMachine slotMachine;

  public NoToken(SlotMachine slotMachine) {
    this.slotMachine = slotMachine;
  }

  @Override
  public void insertToken() {
    System.out.println("Inserted a token...");
    slotMachine.setThisState(slotMachine.getTokenState());
  }

  @Override
  public void pullLever() {
    System.out.println("Cannot play to win until you insert a token!");
  }

  @Override
  public void payout() {
    throw new UnsupportedOperationException("Nice try bub!");
  }
}
