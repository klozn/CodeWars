package main.java;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(432634));
    }

    public static int sortDesc(final int num) {
        char[] numbersArr = Integer.toString(num).toCharArray();
        Arrays.sort(numbersArr);
        String numbers = Arrays.toString(numbersArr);
        numbers = numbers.replace(" ", "");
        numbers = numbers.replace(",", "");
        numbers = numbers.replace("[", "");
        numbers = numbers.replace("]", "");
        int nrOfNumbers = numbers.length();
        String reversedNumbers = "";

        for (int i = 0; i < nrOfNumbers; i++) {
            reversedNumbers = reversedNumbers.concat(String.valueOf(numbers.charAt(nrOfNumbers - 1 - i)));
        }

        return Integer.parseInt(reversedNumbers);

        /* CODEWARS SOLUTION
        public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
         */
    }
}
