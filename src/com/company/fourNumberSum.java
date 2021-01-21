package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourNumberSum {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> list = new ArrayList();
        Arrays.sort(array);
        for (int i = 0; i <array.length - 3; i++) {
            for (int j = i + 1; j <array.length - 2 ; j++) {
                int left = j + 1;
                int right = array.length - 1;
                while (left < right){
                    if(array[j] + array[i] + array[left] + array[right] == targetSum) {
                        Integer[] toAdd = {array[j], array[i], array[left], array[right]};
                        list.add(toAdd);
                        left++;
                        right--;
                    }else if(array[j] + array[i] + array[left] + array[right] < targetSum){
                        left++;
                    }else if (array[j] + array[i] + array[left] + array[right] > targetSum){
                        right--;
                    }
                }
            }
        }
        return list;
    }

}
