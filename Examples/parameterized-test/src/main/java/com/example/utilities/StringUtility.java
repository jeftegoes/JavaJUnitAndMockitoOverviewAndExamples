package com.example.utilities;

public class StringUtility {
    public char[] everyNthChar(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLenght = sourceArray.length / n;
        char[] result = new char[returnedLenght];
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }

    public String removePairs(String source) {
        if (source == null || source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length - 1; i++) {
            if (string[i] != string[i + 1]) {
                sb.append(string[i]);
            }
        }

        sb.append(string[string.length - 1]);

        return sb.toString();
    }

    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }

        return null;
    }

    public String truncateAInFirst2Positions(String str) {
        if (str.length() <= 2)
            return str.replace("A", " ");

        String first2Chars = str.substring(0, 2);
        String stringMinusFirst2Chars = str.substring(2);

        return first2Chars.replace("A", "") + stringMinusFirst2Chars;
    }

    public boolean areFirstAndLasTwoCharactersTheSame(String str) {
        if (str.length() <= 1)
            return false;

        if (str.length() == 2)
            return true;

        String first2Chars = str.substring(0, 2);

        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);
    }
}
