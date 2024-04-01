package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles were driven?: ");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas was used?: ");
        double amountOfGas = input.nextDouble();

        double milesPerGallon = (amountOfGas / milesDriven);
        System.out.println("Your MPG is " + milesPerGallon);
    }
}
