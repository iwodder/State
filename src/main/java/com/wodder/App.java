package com.wodder;

import com.wodder.slots.SlotMachine;

public class App {
  private static final SlotMachine SLOT_MACHINE = new SlotMachine();

  public static void main(String[] args) {

    for (int i = 1; i < 101; i++) {
      System.out.printf("Playing round #%d%n", i);
      printSeparator();
      playRound();
      printSeparator();
    }
    printStats();
  }

  private static void playRound() {
    SLOT_MACHINE.insertToken();
    SLOT_MACHINE.pullLever();
    SLOT_MACHINE.payout();
  }

  private static void printSeparator() {
    System.out.println("====================================");
  }

  private static void printStats() {
    System.out.println("Game Summary");
    System.out.printf("\t# of rounds: %d%n", SLOT_MACHINE.getNumberOfPlays());
    System.out.printf("\t# of wins: %d%n", SLOT_MACHINE.getNumberOfWins());
    System.out.printf("\t%% wins %.2f", SLOT_MACHINE.getWinPercent());
  }
}
