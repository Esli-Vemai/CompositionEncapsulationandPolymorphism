package com.java.array;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {
        int[] array;
        array = new int[]{1,2,3,4,56,7, 8};
        System.out.println("Original Array value: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Array value after reverse: " + Arrays.toString(array));
    }


    public static void reverse(int[] array){
        int maxIndx = array.length - 1;
        int halflength = array.length/2;

        for (int i = 0; i<halflength; i++){
            int temp = array[i];
            array[i] = array[maxIndx-i];
            array[maxIndx-i] = temp;
        }
    }
}
