package program;

import java.util.Scanner;

/**
 * Source: https://leetcode.com/problems/palindrome-number/
 */

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Example 4:
 * Input: x = -101
 * Output: false
 */

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to check: ");
        int x = input.nextInt();

        if (isPalindromeNumber(x))
        {
            System.out.println("This number is a palindrome number");
        }

        else
        {
            System.out.println("This number is not a palindrome number");
        }
    }

    public static boolean isPalindromeNumber(int x) {

        if (x < 0)
        return false;

        int checkMate = x;
        int count = 0;
        int number = x;
        int y = x;

        while (x!=0)
        {
            x/=10;
            count++;
        }
        long z = 0;

        int temp;
        for (int i = 1; i <= count; i++)
        {
            y/=(Math.pow(10, i-1));
            temp = y;
            z+=(y*(Math.pow(10,count-i)));
            System.out.println(z);

            y = (int) (number - ((temp*(Math.pow(10,count-i)))));
            number = y;
            System.out.println(y);
        }
        
        return z==checkMate;
        

        /**
         * You can do an easier way is to create an array with elements in it and then convert that array to a number to check.
         */
    }
}
