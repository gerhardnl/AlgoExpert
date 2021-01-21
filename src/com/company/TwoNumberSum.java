package com.company;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] result = {};
        int[] temp = new int[2];
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j <array.length ; j++) {
                if (array[i] + array[j] == targetSum) {
                    temp[0] = array[i];
                    temp[1] = array[j];
                    return temp;
                }
            }
        }
        return result;
    }
}
