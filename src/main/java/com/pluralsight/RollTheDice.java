package com.pluralsight;

public class RollTheDice {
    static void main() {
        Dice dice = new Dice();

        // init 2 dices
        int roll1, roll2;

        // 4 different counters for number of times rolled
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for(int i = 9; i <= 100; i++){
            // roll dices
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.printf("Roll %d: %d - %d Sum: %d%n", i, roll1, roll2, sum);

        }

    }
}
