package org.launchcode;


import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, what is your name:");

        String name = input.nextLine().trim();
        System.out.println("Hello " + name);
    }
}
