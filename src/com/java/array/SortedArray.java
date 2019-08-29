package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Inside main method");
        int[] array = getIntegers(5);
        printArray(array);
        int[] sorted = sortIntegers(array);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity){
        System.out.println("Inside getIntegers method");
        int[] inputArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values \r");
        for(int a=0; a<inputArray.length; a++){
            inputArray[a] = scanner.nextInt();
        }
        return inputArray;
    }


    public static void printArray(int[] printArr){
        System.out.println("Inside printArray method");
        for (int i=0; i<printArr.length; i++){
            System.out.println("Array element " + i + " contains " + printArr[i]);
        }
        System.out.println("\r");
    }


    public static int[] sortIntegers(int[] array){
        System.out.println("Inside sortIntegers method");
        int[] sortedArr = new int[array.length];
        int highest = 0;

        /*for (int a = 0; a<array.length; a++){
             sortedArr[a] = array[a];
        }*/
        // alternative of for loop to copy array
        sortedArr = Arrays.copyOf(array, array.length);

        boolean flag = true;
        while (flag){
            flag = false;

            for (int i = 0; i<sortedArr.length-1; i++){
                if (sortedArr[i]<sortedArr[i+1]){
                    highest = sortedArr[i+1];
                    sortedArr[i+1] = sortedArr[i];
                    sortedArr[i] = highest;
                    flag = true;
                }
            }

        }
        return sortedArr;
    }
}
