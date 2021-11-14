package solution;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */


public class SingleNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
        int nums;
        int n = sc.nextInt();
        int [] a = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("The element a["+i+"] of array:");
            a[i] = sc.nextInt();
        }
        System.out.printf("We have an array like this: ");
        System.out.printf(Arrays.toString(a));

        nums = findTheSingleNumber(a);
        System.out.println("\nThe number you want to find in the array is "+ nums);


    }

    public static int findTheSingleNumber(int a[]) {
        int number = 0;

        for (int i=0; i<a.length-1; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                int temp;
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        if(a.length>=2)

        {
            if (a[a.length-1]==a[a.length-2] && a[0]==a[1])
            {
                for (int j=1; j<a.length-1; j++)
                {
                    if(a[j]!=a[j-1] && a[j]!=a[j+1]) {
                        number = a[j];
                    }
                }
            }

            if(a[0]!=a[1])
            {return a[0];}

            if(a[a.length-1]!=a[a.length-2])
            {return a[a.length-1];}

        }

        if(a.length==1)
        {return a[0];}

        return number;
    }
}
