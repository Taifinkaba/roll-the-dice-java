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

            // count the sums
            switch(sum){
                case 2 -> twoCounter++;
                case 4 -> fourCounter++;
                case 6 -> sixCounter++;
                case 7 -> sevenCounter++;
                default -> System.out.println("Next Batch!");
            }
        }

        System.out.println("Results after 100 rolls:");
        System.out.println("Sum of 2: " + twoCounter + " times");
        System.out.println("Sum of 4: " + fourCounter + " times");
        System.out.println("Sum of 6: " + sixCounter + " times");
        System.out.println("Sum of 7: " + sevenCounter + " times");
    }
}
