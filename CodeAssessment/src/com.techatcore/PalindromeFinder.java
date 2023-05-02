package com.techatcore;

import java.util.ArrayList;
import java.util.List;

public class PalindromeFinder {
    public static void main(String[] args) {
        // Create an array of input strings
        String[] inputStrings = { "KARTHIK", "DAD", "HANNAH", "APPLE", "REFER" };

        // Create two ArrayLists to store palindrome and non-palindrome strings
        List<String> palindromes = new ArrayList<>();
        List<String> nonPalindromes = new ArrayList<>();

        for (String inputString : inputStrings) {
            // Using if checking is string a palidrome
            if (isPalindrome(inputString)) {
                // If yes, adding it to palindrome list
                palindromes.add(inputString);
            } else {
                // If it's not, adding it to non palindrome list
                nonPalindromes.add(inputString);
            }
        }
        // Print the number of palindrome strings and their values
        System.out.println("Count of Palindrome Strings: " + palindromes.size());
        for (String palindrome : palindromes) {
            System.out.println("Palindrome string: " + palindrome);
        }
        // Print the number of non-palindrome strings and their values
        System.out.println("Count of Non - Palindrome Strings: " + nonPalindromes.size());
        for (String nonPalindrome : nonPalindromes) {
            System.out.println("Non - Palindrome string: " + nonPalindrome);
        }
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String inputString) {
        String reverseString = "";
        int inputStringLength = inputString.length() - 1;
        for (int count = inputStringLength; count >= 0; --count) {
            reverseString += inputString.charAt(count);
        }
        // If the given input string is a palindrome
        if (inputString.equals(reverseString)) {
            return true;
        } else { // If it is a non palindrome
            return false;
        }
    }
}