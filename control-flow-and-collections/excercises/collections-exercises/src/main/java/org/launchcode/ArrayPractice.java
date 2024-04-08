package org.launchcode;

import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] exampleArray = {1, 1, 2, 3, 5, 8};

        for (int i : exampleArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

}