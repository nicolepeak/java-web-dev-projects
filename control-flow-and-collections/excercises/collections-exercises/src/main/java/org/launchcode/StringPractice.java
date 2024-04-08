package org.launchcode;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
    String stringExample =
            "I would not, could not, in a box. " +
                    "I would not, could not with a fox. " +
                    "I will not eat them in a house. " +
                    "I will not eat them with a mouse.";

    String [] splitStringArray = stringExample.split("\\.");

        System.out.println(Arrays.toString(splitStringArray));
    }
}
