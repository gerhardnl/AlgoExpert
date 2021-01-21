package com.company;

import java.util.ArrayList;
import java.util.List;

public class MaxSumIncrisingSubsequence {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subSequence = new ArrayList<>();

        int lastAdded = 0;
        int total = 0;

        for (int i = 0; i < array.length ; i++) {
            List<Integer> temp = new ArrayList<>();
            int tempTotal = 0;
            temp.add(array[i]);
            lastAdded = array[i];
            tempTotal = array[i];

            for (int j = 1 + i; j < array.length ; j++) {
                if (array[j] > lastAdded){
                    temp.add(array[j]);
                    lastAdded = array[j];
                    tempTotal += array[j];
                }
            }
            if (tempTotal > total){
                subSequence = temp;
                total = tempTotal;
            }
        }
        result.add(List.of(total));
        result.add(subSequence);

        return result;
    }

    public static void main(String[] args) {
        int[] array = {10,70,20,30,40,50,11,30};
        maxSumIncreasingSubsequence(array);
    }
}
