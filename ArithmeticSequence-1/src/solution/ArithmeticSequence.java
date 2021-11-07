package solution;

import java.util.Scanner;

/**
 * Input an integer number N and then print the sum of digits so that the condition is satisfied:
 *
 * 1+2+3+4+...<= N
 *
 * Example:
 * N = 16:
 * 1+2+3+4+5<=16
 */

public class ArithmeticSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        if (n > 0) {

            if(n==1 || n==2)
            {
                System.out.println("1");
            }

            int k = 1;
            int count = 1;
            System.out.printf("1");
            while (true) {
                k+=1;
                count+=k;
                if (count > n)
                    break;
                System.out.printf(" + " + k);
            }
            System.out.printf(" <= " + n);
        }

        else
            System.out.println("Please enter integer number with value > 0");
    }
}