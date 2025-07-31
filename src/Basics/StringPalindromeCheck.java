package Basics;

import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word = sc.nextLine();

        // Remove spaces and turn into lowercase

        word = word.replaceAll("\\s+", "").toLowerCase();

        // reverse string

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
        sc.close();

    }

}
