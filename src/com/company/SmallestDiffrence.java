package com.company;

public class SmallestDiffrence {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int difference = Integer.MAX_VALUE;
        int[] result = new int[2];
        for (int i = 0; i < arrayOne.length ; i++) {
            for (int j = 0; j < arrayTwo.length ; j++) {
                if (Math.abs(arrayOne[i] - arrayTwo[j]) < difference){
                    difference = Math.abs(arrayOne[i] - arrayTwo[j]);
                    result[0] = arrayOne[i];
                    result[1] = arrayTwo[j];
                }
            }
        }

        return result;
    }
}
