package com.erikriosetiawan;

import java.util.Scanner;

public class Solution {

    private static void miniMaxSum(int[] arr) {
        // Sorting the array using bubble sort algorithm
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int[] minArray = new int[4];
        int[] maxArray = new int[4];

        // Copy the minimum value
        for (int i = 0; i < minArray.length; i++)
            minArray[i] = arr[i];

        // Copy the maximum value
        for (int i = arr.length - 1; i > 0; i--)
            maxArray[i - 1] = arr[i];

        long minimumSum = 0L;
        long maximumSum = 0L;

        // Sum the array elements
        for (int i = 0; i < minArray.length; i++) {
            minimumSum += minArray[i];
            maximumSum += maxArray[i];
        }

        // Print the result
        System.out.printf("%d %d", minimumSum, maximumSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
