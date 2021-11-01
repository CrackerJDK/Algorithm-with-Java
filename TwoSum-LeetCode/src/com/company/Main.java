package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *Level of difficult: EASY
 */

/**
 * Source: https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

/**
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

/**
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */

/**
 * Example 2:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

/**
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Main {

    public static Scanner input = new Scanner(System.in);

    private static int n;

    public static void main(String[] args) {
        System.out.println("Enter the number of elements of the array: ");
        n = input.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter into array["+ i +"] section of array");
            array[i] = input.nextInt();
        }

        System.out.println("Enter the target number");
        int targetNumber = input.nextInt();

        Main obj = new Main();
        System.out.println(Arrays.toString(obj.getArray(array,targetNumber)));

    }

    int [] getArray(int arr[], int targetNumber) {
        int [] twoNumber1 = new int[2];

        for (int i = 0; i < n-1; i++)
        {
            for (int j = 1; j < n; j++)
            {
                if (arr[i] + arr[j] == targetNumber && && i!=j)
                {
                    twoNumber1 = new int[]{i, j};
                }
            }
        }

        /**
         * I want to rearrange the array a bit, maybe this step is not necessary.
         */

        int [] twoNumber2 = Arrays.copyOf(twoNumber1, twoNumber1.length);
        Arrays.sort(twoNumber2);
        return twoNumber2;
    }
}
