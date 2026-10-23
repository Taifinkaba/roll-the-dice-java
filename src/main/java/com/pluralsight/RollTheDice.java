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

        // counter for each goes into display method
        System.out.println("Results after 100 rolls:");
        display(2, twoCounter);
        display(4, fourCounter);
        display(6, sixCounter);
        display(7, sevenCounter);



    }

    static void display(int sum, int counter) {
        System.out.println("Sum of " + sum+ ": " + counter+ " times");

    }
}
