package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i <array.length-2 ; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right){
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum){
                    Integer[] triplet = {array[i], array[left], array[right]};
                    list.add(triplet);
                    left++;
                    right--;
                }else if(currentSum > targetSum){
                    right--;
                }else if(currentSum < targetSum){
                    left++;
                }
            }
        }
        return list;
    }

}
