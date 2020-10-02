package com.wodder.slots.states;

import com.wodder.slots.SlotMachine;

public class NoWinner implements SlotState {

  private final SlotMachine slotMachine;

  public NoWinner(SlotMachine slotMachine) {
    this.slotMachine = slotMachine;
  }

  @Override
  public void insertToken() {
    System.out.println("Hold your horses, I'll take all your money again soon.");
  }

  @Override
  public void pullLever() {
    System.out.println("Hold on, hold on, need your money before the lever works.");
  }

  @Override
  public void payout() {
    System.out.println("Look at all that sweet... oh wait... You're not a winner!");
    slotMachine.setThisState(slotMachine.getNoTokenState());
  }
}
