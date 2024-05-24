package org.example;

public class App {
    public static void main(String[] args) {

            SumCalculator calculator = new SumCalculator();
            Checker checker = new Checker();

        try {
            int userInput = checker.checkIn();
            int result = calculator.sum(userInput);
            System.out.println("Sum from 1 to " + userInput + ": " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}