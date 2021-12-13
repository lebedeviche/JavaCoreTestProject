package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1");
        for (int i = 0; i < 10000; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nTask2");
        int numbersAmount = 0;
        double sum = 0;
        for (int i = 0; i <= 200; i++) {
            if (i % 10 == 0) {
                sum += i;
                numbersAmount++;
            }
        }
        double arithmeticMean = sum / numbersAmount;
        System.out.print(arithmeticMean);
    }

}

