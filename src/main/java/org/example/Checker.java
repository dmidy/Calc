package org.example;

import java.util.Scanner;

public class Checker {
    protected int input;
    protected int checkIn(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Your number?:");
        this.input = scan.nextInt();
        scan.close();


        return this.input;
    }
}
