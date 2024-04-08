package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle? ");
        double radius = input.nextDouble();

        while (!input.hasNextDouble()) {
            System.out.println("Error: Enter a number");
            input.next();
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is: " + area);

    }
}
