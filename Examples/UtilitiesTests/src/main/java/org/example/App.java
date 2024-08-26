package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        char[] myChar = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);

        for (int i = 0; i < myChar.length; i++) {
            System.out.println(myChar[i]);
        }

        System.out.println("utilities.removePairs: " + utilities.removePairs("AABCDDEFF"));

        System.out.println(utilities.nullIfOddLength("tests"));

        System.out.println(utilities.converter(10, 5));
    }
}
