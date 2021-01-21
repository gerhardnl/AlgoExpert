package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxSumIncrisingSubsequence {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subSequenceTemp = new ArrayList<>();
        List<Integer> currentSubSequence = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int total = Integer.MIN_VALUE;
        int pointer = 0;

        for (int i = 0; i < array.length ; i++) {
            int tempToAdd = array[i];
            subSequenceTemp.add(-1);
            for (int j = i; j >= 0 ; j--) {
                if (array[j] < array[i] && tempToAdd - array[j] <= array[i]){
                    tempToAdd = temp.get(j) + array[i];
                    subSequenceTemp.set(i, j);
                }
                pointer = i;
            }
            temp.add(tempToAdd);
            if(tempToAdd > total){
                total = tempToAdd;
                currentSubSequence.clear();
                while (true){
                    currentSubSequence.add(0,array[pointer]);
                    pointer = subSequenceTemp.get(pointer);
                    if (pointer == -1) break;
                }
            }
        }
        result.add(List.of(total));
        result.add(currentSubSequence);

        return result;
    }

    public static void main(String[] args) {
        int[] array = {-1,1};
        maxSumIncreasingSubsequence(array);
    }
}
