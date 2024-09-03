package org.example;

public class App {
    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        System.out.println(stringHelper.truncateAInFirst2Positions("CDAA"));
        System.out.println(stringHelper.areFirstAndLasTwoCharactersTheSame("ABAB"));
    }
}
