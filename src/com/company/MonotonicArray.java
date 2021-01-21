package com.company;

import java.util.ArrayList;
import java.util.List;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        boolean isIncreasing = true;
        for (int i = 0; i < array.length -1 ; i++) {
            if (array[i] > array[i+1]){
                isIncreasing = false;
                break;
            }else if(array[i] < array[i+1]){
                isIncreasing = true;
            }else if(i == array.length -1){
                return true;
            }
        }
        if(isIncreasing){
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i+1]){
                    return false;
                }
            }
        }else {
            for (int i = 0; i < array.length -1 ; i++) {
                if (array[i] < array[i+1]){
                    return false;
                }
            }
        }
        return true;
    }

}
