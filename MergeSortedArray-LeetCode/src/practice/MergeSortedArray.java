package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *Level of difficult: MEDIUM
 */

/**
 * You are given two integer arrays nums1 and nums2
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order and eliminate the zeros of the two arrays.
 */

/**
 * Example 1:
 *
 * Input: nums1 = [3,1,2,0,4,0], nums2 = [5,5,6],
 * Output: [1,2,3,4,5,5,6]
 */

/**
 * Example 2:
 *
 * Input: nums1 = [0,1,0,0,4,0], nums2 = [5,7,6,0,2],
 * Output: [1,2,4,5,6,7]
 */

public class MergeSortedArray {

    private static Scanner input = new Scanner(System.in);
    private static int index = 0;

    public static void main(String[] args) {

        System.out.println("Enter the number of elements of the first array");
        int n = input.nextInt();
        int [] array1 = new int[n];

        System.out.println("Enter the number of elements of the second array");
        int m = input.nextInt();
        int [] array2 = new int[m];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the element a["+i+"] of array1");
            array1[i] = input.nextInt();
        }

        for (int i = 0; i < m; i++)
        {
            System.out.println("Enter the element a["+i+"] of array2");
            array2[i] = input.nextInt();
        }


        int [] arr = mergeTwoArrays(array1,array2);
        System.out.println("---------------------------------------------------");
        System.out.println(Arrays.toString(sortArrayByBubbleSortAlgorithm(arr)));
        System.out.println("---------------------------------------------------");


    }

    public static int [] mergeTwoArrays(int [] array1, int [] array2) {

        for (int i = 0; i < array1.length; i++)
        {
            if(array1[i]!=0)
            {
                index++;
            }
        }

        for (int i = 0; i < array2.length; i++)
        {
            if(array2[i]!=0)
            {
                index++;
            }
        }

        int [] mergeArray = new int[index];

        int k = 0;
        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i]!=0)
            {
                mergeArray[k] = array1[i];
                k++;
            }
        }

        for (int i = 0; i < array2.length; i++)
        {
            if (array2[i]!=0)
            {
                mergeArray[k] = array2[i];
                k++;
            }
        }

        return mergeArray;
    }

    /**
     * BUBBLE SORT ALGORITHM
     */

    private static int [] sortArrayByBubbleSortAlgorithm(int [] array) {

        for (int i = 0; i < index; i++)
        {
            for (int j = 0; j < index-i-1; j++)
            {
                if(array[j+1] < array[j])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}
