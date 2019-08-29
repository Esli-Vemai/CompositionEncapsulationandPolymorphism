package com.practive.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Inside main");
        System.out.println("Enter the number of elements you want in your array \r");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] arr = readIntegers(count);
        System.out.println("Arrays" + Arrays.toString(arr));
        System.out.println("Minimum value in the array is + " + findMin(arr));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter your " + count + " elements of arrays \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        System.out.println("Inside fineMin()");
        int minVal = Integer.MAX_VALUE;
        //3, 4, 6 ,2 , 1
        // i=1 , 2, i = 2
        for (int i=0;i<array.length; i++){
            int val = array[i];
            if(val <minVal){
                minVal = val;
            }
        }
        return minVal;
    }

}
