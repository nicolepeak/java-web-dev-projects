package org.launchcode;

import java.util.Scanner;

public class StringAdventures {
    public static void main (String[] args) {
//        String aliceAdventures =
//                "Alice was beginning to get very tired of sitting" +
//                        "by her sister on the bank, and having nothing to do:" +
//                        "once or twice she had peeped into the book her sister" +
//                        "was reading, but it had no pictures or conversations in it," +
//                        "'and what is the use of a book,' thought Alice 'without " +
//                        "pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word inside the text: ");
        String search = input.next();

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do";
        Integer index = firstSentence.indexOf(search);
        Integer length = search.length();

        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(search, "");
        System.out.println(modifiedSentence);


//        String doesContainSearch = String.valueOf(aliceAdventures.toLowerCase().contains(search.toLowerCase())) ;
//        System.out.println("Does it contain your search? " + doesContainSearch);


    }
}
