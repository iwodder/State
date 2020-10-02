package com.wodder.slots.states;

import com.wodder.slots.SlotMachine;

public class Winner implements SlotState {

  private final SlotMachine slotMachine;

  public Winner(SlotMachine slotMachine) {
    this.slotMachine = slotMachine;
  }

  @Override
  public void insertToken() {
    System.out.println("Cannot take money, while I give you money.");
  }

  @Override
  public void pullLever() {
    System.out.println("Hold on, hold on, need your money before the lever works.");
  }

  @Override
  public void payout() {
    System.out.println("Look at all that sweet gold!!! You're a winner!");
    slotMachine.incNumberOfWins();
    slotMachine.setThisState(slotMachine.getNoTokenState());
  }
}
