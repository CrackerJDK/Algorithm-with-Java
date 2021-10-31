package program;

import java.util.Scanner;


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
        int z = 0;

        int temp;
        for (int i = 1; i <= count; i++)
        {
            y/=(Math.pow(10, count-i));
            temp = y;
            z+=(y*(Math.pow(10,count-i)));
            System.out.println(z);

            y = (int) (number - ((temp*(Math.pow(10,count-i)))));
            number = y;
            System.out.println(y);
        }

        /**
         * You can do an easier way is to create an array with elements in it and then convert that array to a number to check.
         */

        if (z==checkMate)
        {
            return true;
        }

        else return false;
    }
}
