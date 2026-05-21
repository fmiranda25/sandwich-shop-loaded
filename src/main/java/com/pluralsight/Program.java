package com.pluralsight;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double sandwichPrice = 0;

        System.out.println("Would you like sandwich size 1 or 2?: ");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        int sandwichSize = input.nextInt();
        input.nextLine();

        System.out.println("Would you like your sandwich loaded?: ");
        String loadPreference = input.nextLine();

        System.out.println("Enter your age: ");
        int userAge = input.nextInt();

        if (sandwichSize == 1){
            sandwichPrice = 5.45;
            if (loadPreference.equals("yes")) {
                sandwichPrice += 1.00;
            }
        } else if (sandwichSize == 2){
            sandwichPrice = 8.95;
            if (loadPreference.equals("yes")) {
                sandwichPrice += 1.75;
            }
        }

        if (userAge <= 17){
            sandwichPrice *= 0.9;
        } else if (userAge >= 65){
            sandwichPrice *= 0.8;
        }
        System.out.printf("That will be $%.2f", sandwichPrice);
    }
}
