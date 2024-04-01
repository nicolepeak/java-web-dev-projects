package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the desired rectangle?: ");
        int length = input.nextInt();

        System.out.println("What is the desired width?: ");
        int width = input.nextInt();

        int rectangleArea = (length * width);
        System.out.println("Your rectangle's area is " + rectangleArea);
    }
}
